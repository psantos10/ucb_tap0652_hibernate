package me.patricio.tap_hibernate.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.EnumSet;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import me.patricio.tap_hibernate.modelo.Aluno;

public class TesteCriarEntidade {

	public static void main(String[] args) {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/ucb_tap0652?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		MetadataSources metadata = new MetadataSources(new StandardServiceRegistryBuilder()
				.applySetting("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect")
				.applySetting("javax.persistence.schema-generation-connection", connection).build());

		metadata.addAnnotatedClass(Aluno.class);

		SchemaExport export = new SchemaExport();
		export.create(EnumSet.of(TargetType.DATABASE), metadata.buildMetadata());

	}

}
