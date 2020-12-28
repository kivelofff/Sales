package org.prodavavsto.dao;

import org.prodavavsto.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ResultDao {

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Result> findAll() {
        final String request = "SELECT * FROM microprobe";
        List<Result> listResult = jdbcTemplate.query(request, BeanPropertyRowMapper.newInstance(Result.class));

        return listResult;
    }
    public void add (Result result) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("microprobe").usingColumns("sample",
                "particle_num",
                "C_U234",
                "C_U234_Err",
                "C_U235",
                "C_U235_Err",
                "C_U236",
                "C_U236_Err",
                "C_U236_Raw",
                "C_U238",
                "C_U238_Err",
                "R_239_238");
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(result);
        insertActor.execute(param);
    }
    public Result getById (int id) {
        final String sql = "select * from microprobe where id = ?";
        Object[] args = {id};
        Result result = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Result.class));
        return result;
    }

    public void update (Result result) {
        final String request = "UPDATE microprobe SET sample=:sample, " +
                "particle_num=:particle_num, " +
                "C_U234=:c_U234, " +
                "C_U234_Err=:c_U234_Err, " +
                "C_U235=:c_U235, " +
                "C_U235_Err=:c_U235_Err, " +
                "C_U236=:c_U236, " +
                "C_U236_Err=:c_U236_Err, " +
                "C_U236_Raw=:c_U236_Raw, " +
                "C_U238=:c_U238, " +
                "C_U238_Err=:c_U238_Err, " +
                "R_239_238=:r_239_238";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(result);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(request, param);
    }

    public void delete (int id) {
        final String request = "delete from microprobe where id = ?";
        jdbcTemplate.update(request, id);
    }
}
