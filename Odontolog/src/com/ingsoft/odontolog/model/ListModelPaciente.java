package com.ingsoft.odontolog.model;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.swing.AbstractListModel;


public class ListModelPaciente extends AbstractListModel {
	
	private ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
	private static final ListModelPaciente INSTANCE = new ListModelPaciente();
	
	public static ListModelPaciente getInstance() {
        return INSTANCE;
	}
	
	private ListModelPaciente(){};
	
	public void addPaciente(Paciente nuevoPaciente){
		listaPaciente.add(nuevoPaciente);
	}
	public void removePacienet(Paciente rmPaciente){
		listaPaciente.remove(rmPaciente);
	}
	
	public Paciente getPaciente(int index){
		return listaPaciente.get(index);
	}
	
	public void ordenarAlfa(){
		listaPaciente.sort(null);
	}
	
	public int getPacientePorNombre(String name){
		
		for(int i=0; i<listaPaciente.size(); i++){
			if(listaPaciente.get(i).getNombreCompleto().startsWith(name.toUpperCase())){
				return i;
			}
		}
		return 0;
	}
	
	@Override
	public Object getElementAt(int index) {return listaPaciente.get(index).getNombreCompleto();}

	@Override
	public int getSize() {return listaPaciente.size();}
}
