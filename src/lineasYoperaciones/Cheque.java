package lineasYoperaciones;

import java.util.Date;

public class Cheque extends Operacion {

    public enum TipoCheque {
        PROPIO
        , TERCERO
        , PAGARE
    }

    public final static double PORCENTAJE_COMISION = 0.03;

    private TipoCheque tipoCheque;
    private String banco;
    private String numero;
    private Date fechaVencimiento;
    private String cuitFirmante;

    private double tasaDescuento;


    public Cheque(double importeDeOperacion
            , TipoCheque tipoCheque
            , String banco
            , String numero
            , Date fechaVencimiento
            , String cuitFirmante
            , double tasaDescuento) {
        super(importeDeOperacion);
        this.tipoCheque = tipoCheque;
        this.banco = banco;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cuitFirmante = cuitFirmante;
        this.tasaDescuento = tasaDescuento;
    }

    @Override
    public double importeVivo() {
        return this.importeDeOperacion;
    }

    @Override
    public void emiteCertificado(String numeroCertificado) {
        this.estadoOperacion = EstadoOperacion.CERTIFCADO_EMITIDO;
        this.certificadoGarantia = numeroCertificado;
    }

    @Override
    public String toString() {
        return "Cheque{" +
                "tipoCheque=" + tipoCheque +
                ", banco='" + banco + '\'' +
                ", numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cuitFirmante='" + cuitFirmante + '\'' +
                ", tasaDescuento=" + tasaDescuento +
                '}';
    }
}
