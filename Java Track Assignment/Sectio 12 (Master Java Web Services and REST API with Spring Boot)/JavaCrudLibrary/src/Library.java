import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library {

	private JFrame frame;
	private JTextField txtId;
	private JTextField txtTitle;
	private JTextField txtAuthor;
	private JTextField txtYear;
	private JTextField txtPages;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library() {
		initialize();
		Connect();
		table_load();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void Connect() {
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDB", "root", "root");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void table_load() {
		try {
			pst = con.prepareStatement("select * from book");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e3) {
			// TODO: handle exception
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(25, 31, 35, 22);
		frame.getContentPane().add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(82, 32, 175, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAuthor.setBounds(25, 95, 50, 22);
		frame.getContentPane().add(lblAuthor);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYear.setBounds(25, 128, 35, 22);
		frame.getContentPane().add(lblYear);
		
		JLabel lblPages = new JLabel("Pages");
		lblPages.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPages.setBounds(25, 161, 50, 22);
		frame.getContentPane().add(lblPages);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitle.setBounds(25, 64, 35, 22);
		frame.getContentPane().add(lblTitle);
		
		txtTitle = new JTextField();
		txtTitle.setColumns(10);
		txtTitle.setBounds(82, 65, 175, 20);
		frame.getContentPane().add(txtTitle);
		
		txtAuthor = new JTextField();
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(82, 96, 175, 20);
		frame.getContentPane().add(txtAuthor);
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		txtYear.setBounds(82, 129, 175, 20);
		frame.getContentPane().add(txtYear);
		
		txtPages = new JTextField();
		txtPages.setColumns(10);
		txtPages.setBounds(82, 162, 175, 20);
		frame.getContentPane().add(txtPages);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id, title, author, year, pages;
				
				id = txtId.getText();
				title = txtTitle.getText();
				author = txtAuthor.getText();
				year = txtYear.getText();
				pages = txtPages.getText();
				
				try {
					pst = con.prepareStatement("insert into book(ID, Title, Author, Year, Pages) values(?,?,?,?,?)");
					pst.setString(1, id);
					pst.setString(2, title);
					pst.setString(3, author);
					pst.setString(4, year);
					pst.setString(5, pages);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Book added successfully!");
					table_load();
					
					txtId.setText("");
					txtTitle.setText("");
					txtAuthor.setText("");
					txtYear.setText("");
					txtPages.setText("");
					
					txtId.requestFocus();
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			
			}
		});
		btnNewButton.setBounds(25, 215, 68, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id, title, author, year, pages;
				
				id = txtId.getText();
				title = txtTitle.getText();
				author = txtAuthor.getText();
				year = txtYear.getText();
				pages = txtPages.getText();
				
				try {
					pst = con.prepareStatement("update book set title=?, author=?, year=?, pages=? where id=?");
					
					pst.setString(1, title);
					pst.setString(2, author);
					pst.setString(3, year);
					pst.setString(4, pages);
					pst.setString(5, id);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Book Updated successfully!");
					table_load();
					
					txtId.setText("");
					txtTitle.setText("");
					txtAuthor.setText("");
					txtYear.setText("");
					txtPages.setText("");
					
					txtId.requestFocus();
					
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(103, 215, 76, 30);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtId.getText();
				try {
					pst = con.prepareStatement("delete from book where id=?");
					
					pst.setString(1, id);
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Book deleted successfully!");
					table_load();
					
					txtId.setText("");
					txtTitle.setText("");
					txtAuthor.setText("");
					txtYear.setText("");
					txtPages.setText("");
					
					txtId.requestFocus();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnDelete.setBounds(189, 215, 68, 30);
		frame.getContentPane().add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(282, 35, 300, 209);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Library Books");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(225, 0, 110, 21);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
