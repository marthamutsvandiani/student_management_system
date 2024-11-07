package com.example.studentmanagement;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")  // Ensures that the test profile is used (application-test.properties)
public class StudentmanagementsystemApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Verifying that the application context is loaded correctly
        assertNotNull(dataSource);
    }

    @Test
    public void testDataSource() throws SQLException {
        // Simple database connection test using H2
        try (Connection connection = dataSource.getConnection()) {
            assertNotNull(connection, "Database connection should not be null");
        }
    }
}
