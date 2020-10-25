package controller;

import java.util.List;
import java.util.Scanner;

import modeloLogico.Modelo;
import view.View;

public class Controlador {
	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	public Controlador()
	{
		view = new View();
		modelo = new Modelo();
	}

	public void run()
	{
		Scanner lectura = new Scanner(System.in);
		boolean acabar = false;
		Integer dato = null;
		Comparable rta = " ";
		Comparable respuesta = " ";
		String rtaPeli = " ";

		while(!acabar)
		{
			try {
				view.printMenu();
				int opcion = Integer.parseInt(lectura.nextLine());
				switch(opcion) {
				case 1:
					view.printMessage("Escriba la fecha en la que desea conocer los accidentes");
					String fechareq1 = lectura.nextLine();
					try
					{
						view.printMessage(modelo.conocerAccidentesDeUnaFecha(fechareq1));
					}
					catch (Exception e)
					{
						view.printError("No se uso el formato adecuado, por favor usar el formato AAAA-MM-DD.");
					}
					break;
				case 2:
					view.printMessage("Escriba la fecha hasta donde desea conocer los accidentes");
					String fechareq2 = lectura.nextLine();
					try
					{
						view.printMessage(modelo.conocerLosAccidentesAUnaFechaREQ2(fechareq2));
					}
					catch (Exception e)
					{
						view.printError("No se uso el formato adecuado, por favor usar el formato AAAA-MM-DD.");
					}
					break;
				case 3:
					view.printMessage("Requerimiento aun no realizado."); //ELIMINAR AL REALIZAR REQUERIMIENTO
					break;
				case 4:
					view.printMessage("Requerimiento aun no realizado."); //ELIMINAR AL REALIZAR REQUERIMIENTO
					break;
				case 5:
					view.printMessage("Escriba la hora inicial desde donde desea conocer los accidentes");
					String hora1req5 = lectura.nextLine();
					view.printMessage("Escriba la hora final hasta donde desea conocer los accidentes");
					String hora2req5 = lectura.nextLine();
					try
					{
						view.printMessage(modelo.conocerAccidentesRangoDeHorasREQ5(hora1req5,hora2req5));
					}
					catch (Exception e)
					{
						view.printError("No se uso el formato adecuado, por favor usar el formato AAAA-MM-DD.");
					}
					break;
				case 6:
					view.printMessage("Requerimiento aun no realizado."); //ELIMINAR AL REALIZAR REQUERIMIENTO
					break;
				case 7:
					view.printMessage("Requerimiento aun no realizado."); //ELIMINAR AL REALIZAR REQUERIMIENTO
					break;
				case 8:
					view.printInformacionDeCreadores(); 
					break;
				case 9:
					view.printCambiarDatosACargar();
					int opcion1 = Integer.parseInt(lectura.nextLine());
					switch(opcion1) {
					case 1:
						modelo.RUTA_DATOS_PRINCIPALES = "./data/small/us_accidents_small.csv";
						view.printMessage("\nSe han establecido los datos pequeños para cargar.\n");
						break;
					case 2:
						modelo.RUTA_DATOS_PRINCIPALES = "./data/large/US_Accidents_Dec19.csv";
						view.printMessage("\nSe han establecido los datos grandes para cargar");
						view.printMessage("Recuerde volver a cargar los datos (OPC.10).\n");
						break;
					default:
						view.printErrorConRangoDeEntrada();
						break;
					}
					break;
				case 10:
					modelo.cargarDatosPorFechaInicial(modelo.RUTA_DATOS_PRINCIPALES);
					break;
				case 0:
					acabar=true;
					view.printDespedida();
					break;
				}

			}catch (Exception e) {
				if(e.getClass().equals(java.lang.NumberFormatException.class)) view.printErrorConNumeroDeEntrada();
				else {
					view.printErrorDesconocido();
					e.printStackTrace();

				}

			}

		}

	}
}
