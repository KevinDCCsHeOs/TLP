package Ejercicios;

public class CatalogoDeCuentas {
	public static String Cuenta(String cad) {
		String c="";
		switch(cad) {
		case "1": c="Activos";break;
		case "1.1": c="Activo Circulante";break;
		case "1.1.1": c="Caja";break;
		case "1.1.2": c="Bancos";break;
		case "1.1.3": c="Inversiones Temporales";break;
		case "1.1.4": c="Mercancias, Inventarios o Almacen";break;
		case "1.1.5": c="Clientes";break;
		case "1.1.6": c="Documentos por cobrar";break;
		case "1.1.7": c="Deudores diversos";break;
		case "1.1.8": c="Anticipo a proveedores";break;
		case "1.2": c="Activo fijo";break;
		case "1.2.1": c="Terrenos";break;
		case "1.2.2": c="Edificios";break;
		case "1.2.3": c="Mobiliario y equipo";break;
		case "1.2.4": c="Equipo de computo electrónico";break;
		case "1.2.5": c="Equipo de entrega o reparto";break;
		case "1.2.6": c="Depositos en garantia";break;
		case "1.2.7": c="Inversiones permanentes";break;
		case "1.3": c="Activo Diferido o Cargos Diferidos";break;
		case "1.3.1": c="Gastos de Investigacion y Desarrollo";break;
		case "1.3.2": c="Gastos en etapas preoperativas de organización y administración";break;
		case "1.3.3": c="Gastos de mercadotecnia";break;
		case "1.3.4": c="Gastos de organización";break;
		case "1.3.5": c="Gastos de instalacion";break;
		case "1.3.6": c="Papeleria y utiles";break;
		case "1.3.7": c="Propaganda y publicidad";break;
		case "1.3.8": c="Primas de seguros";break;
		case "1.3.9": c="Rentas pagadas por anticipado";break;
		case "1.3.10": c="Intereses pagados por anticipado";break;
		case "2": c="Pasivo";break;
		case "2.1": c="Pasivo Circulante o Pasivo a Corto Plazo";break;
		case "2.1.1": c="Proveedores";break;
		case "2.1.2": c="Documentos por pagar";break;
		case "2.1.3": c="Acreedores Diversos";break;
		case "2.1.4": c="Anticipo de clientes";break;
		case "2.1.5": c="Gastos pendientes de pago, gastos por pagar o gastos acumulados";break;
		case "2.1.6": c="Impuestos pendientes de pago, impuestos por pagar o impuestos acumulados";break;
		case "2.2": c="Pasivo Fijo o Pasivo a Largo Plazo";break;
		case "2.2.1": c="Hipotecas por pagar o acreedores hipotecarios";break;
		case "2.2.2": c="Documentos por pagar a largo plazo";break;
		case "2.2.3": c="Cuentas por pagar a largo plazo";break;
		case "2.3": c="Pasivo Diferido o Créditos Diferidos";break;
		case "2.3.1": c="Rentas cobradas por anticipado";break;
		case "2.3.2": c="Intereses cobrados por anticipado";break;
		default:c="Cuenta Inexistente";
		}
		return c;
	}
}
