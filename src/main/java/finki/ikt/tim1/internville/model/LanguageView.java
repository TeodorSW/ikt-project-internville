package finki.ikt.tim1.internville.model;

import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class LanguageView {
    private Integer id;
    private String name;
    private String level;

    public LanguageView(Integer id, String name, String level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }
    public static LanguageView mapRowToLanguageView(ResultSet resultSet, int rowNumber) throws SQLException {
        return new LanguageView(
                Integer.parseInt(resultSet.getString("id")),
                resultSet.getString("name"),
                resultSet.getString("level")
        );
    }
}
