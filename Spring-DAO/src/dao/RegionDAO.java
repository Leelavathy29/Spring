package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import model.Region;

@Component
public class RegionDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertRegionInfo(Region region) {
		String sql = "insert into hr.Regions values (" + region.getRegionId() + ",'" + region.getRegionName() + "')";
		System.out.println(sql);
		getJdbcTemplate().update(sql);
	}
}
