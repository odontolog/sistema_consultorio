
public class View {
	
	public loginView login;
	public principalView menu;
	public odontogramaView odontograma;
	public AgendaDeTurnos agenda;
	public adminView administracion;


	
	public View(){
		
	}
	
	public void newLogin(){
		try {
			login = new loginView();
			login.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void newMenu(){
		try {
			menu = new principalView();
			menu.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void newAgenda() {
		try {
			agenda = new AgendaDeTurnos();
			agenda.setVisible(true);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void newAdministracion() {
		try {
			administracion = new adminView();
			administracion.setVisible(true);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void newOdontograma(){
		try {
			odontograma = new odontogramaView();
			odontograma.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
