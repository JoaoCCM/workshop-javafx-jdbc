package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	private Department entity;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	
	@FXML
	private TextField txtId;
	

	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;

	@FXML
	private Button btCalcel;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("idguiwdg");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("ondiowen");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
	}
	
	public void updateFormData() {
		txtId.setText(String.valueOf(entity.getId()));//tem que converter o id em String pq o textField só mexe com string
		txtName.setText(entity.getName());
	}

}
