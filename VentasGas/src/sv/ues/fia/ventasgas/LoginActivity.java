package sv.ues.fia.ventasgas;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
	
	public void actionButton(View v){
		
		String actividad = "MenuPrincipalActivity";
		try{
			Class<?> clase=Class.forName("sv.ues.fia.ventasgas."+actividad);
			Intent inte = new Intent(this,clase);
			this.startActivity(inte);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
