package br.com.amosrodrigues.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.amosrodrigues.model.User;

public class UserRepository {
    
    public static void insertUser(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);

        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.execute();
        ps.close();
        System.out.println("Usuário cadastrado!");
    }

    public static void updateUser(User user) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ?, password = ? WHERE id = ?";

        PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);

        ps.setString(1, user.getName());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setLong(4, user.getId());
        ps.execute();
        ps.close();
        System.out.println("Usuário atualizado!");
    }

    public static void deleteUser(Long id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";

        PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);

        ps.setLong(1, id);
        ps.execute();
        ps.close();
        System.out.println("Usuário deletado!");
    }

}
