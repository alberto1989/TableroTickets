/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inforserveis;

import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 *
 * @author heroe
 */
@Entity
@Table(name="DETCLIMO")
public class DETCLIMO {
    @Id
    @GeneratedValue
    @Column(name="ID") 
   private Integer ID;
    
    @Column(name="RFNCLIENTES")
   private Integer RFNCLIENTES;
    
    @Column(name="FECHA")
   private Timestamp FECHA;
   
   @Column(name="MOTIVO")
   private Blob MOTIVO;

@Column(name="NUMERACION")
   private Integer NUMERACION;

@Column(name="FECHAVISITA")
   private Timestamp FECHAVISITA;

@Column(name="FACTURADO")
   private String FACTURADO;

@Column(name="TERMINADO")
   private String TERMINADO;

@Column(name="TECNICO")
   private String TECNICO;

@Column(name="PEDIDOPOR")
   private String PEDIDOPOR;

@Column(name="TOMADOPOR")
   private String TOMADOPOR;

@Column(name="TRABAJOREALIZADO")
   private Blob TRABAJOREALIZADO;

@Column(name="TIEMPO")
   private Timestamp TIEMPO;

@Column(name="SOFT")
   private String SOFT;

@Column(name="HARD")
   private String HARD;

@Column(name="CLIENTE")
   private String CLIENTE;

@Column(name="TEMA")
   private String TEMA;

@Column(name="TIEMPODIAS")
   private Double TIEMPODIAS;

@Column(name="FECHAREALIZADO")
   private Timestamp FECHAREALIZADO;

@Column(name="PRIORIDAD")
   private String PRIORIDAD;

@Column(name="EMPEZADA") 
   private String EMPEZADA;

@Column(name="PRIORIDAD2")
   private String PRIORIDAD2;

@Column(name="P1")
   private Double P1;

@Column(name="P2")
   private Double P2;

@Column(name="HORAINICIO")
   private Timestamp HORAINICIO;

@Column(name="HORAFIN")
   private Timestamp HORAFIN;

@Column(name="NUMPARTE")
   private Integer NUMPARTE;

@Column(name="MOTIVOENLACE")
   private Blob MOTIVOENLACE;

@Column(name="INTEGRATELBASI")
   private String INTEGRATELBASI;

@Column(name="NSTAREPA")
   private String INSTAREPA;

@Column(name="FECPREVISTA")
   private Timestamp FECPREVISTA;

@Column(name="FECATENCION")
   private Timestamp FECATENCION;

@Column(name="FECMATERIAL")
   private Timestamp FECMATERIAL;

@Column(name="REVISION")
   private String REVISION;

@Column(name="EMAIL")
   private String EMAIL;

@Column(name="RUTAENLACE")
   private String RUTAENLACE;

@Column(name="TICKET")
   private String TICKET;

@Column(name="PRIORIDADTOTAL")
   private Double PRIORIDADTOTAL;

@Column(name="CONCEPTO")
   private String CONCEPTO;

@Column(name="FECPROMCLI")
   private Timestamp FECPROMCLI;

@Column(name="VISTOPOR")
   private String VISTOPOR;

@Column(name="RELACION")
   private String RELACION;

@Column(name="PROMETIDO")
   private String PROMETIDO;

@Column(name="VERSION")
   private String VERSION;

@Column(name="SIGTEVERSION")
   private String SIGTEVERSION;

@Column(name="INCIDENCIA")
   private String INCIDENCIA;

@Column(name="MEDIO")
   private String MEDIO;

@Column(name="MODULO")
   private String MODULO;

@Column(name="EMAIL2")
   private String EMAIL2;

@Column(name="TIPOINCI")
   private String TIPOINCI;

@Column(name="ERRORDE")
   private String ERRORDE;

@Column(name="CONCILIADO")
   private String CONCILIADO;

@Column(name="SELECCIONADO")
   private String SELECCIONADO;

@Column(name="DELIBERANDO")
   private String DELIBERANDO;

@Column(name="APLICATIVO")
   private String APLICATIVO;

@Column(name="STATUSCOTI")
   private String STATUSCOTI;

@Column(name="DOCUMENTADO")
   private String DOCUMENTADO;

@Column(name="UBICADOC")
   private String UBICADOC;

@Column(name="ESTATUSDOC")
   private String ESTATUSDOC;

@Column(name="CATEGORIA")
   private String CATEGORIA;

@Column(name="DIFICULTAD") 
  private String DIFICULTAD;

@Column(name="COMENTARIOS")
   private String COMENTARIOS;

@Column(name="LISTAPROV")
   private String LISTAPROV;

@Column(name="PRIORIDADORI")
   private String PRIORIDADORI;

@Column(name="COMITEDMS")
   private String COMITEDMS;

@Column(name="PRIORIDADVW")
   private String PRIORIDADVW;

@Column(name="SUBPRIORIVW")
   private String SUBPRIORIVW;
@Column(name="APRIMARIA")
   private String APRIMARIA;

@Column(name="ASECUNDARIA")
   private String ASECUNDARIA;

@Column(name="SIGUENTEACCION")
   private String SIGUENTEACCION;

@Column(name="SUBADMON")
   private String SUBADMON;

@Column(name="FECHATREAL")
   private Timestamp FECHATREAL;

@Column(name="COMENTARIOCOMIT")
   private String COMENTARIOCOMIT;

@Column(name="COMITE")
   private String COMITE;

@Column(name="ESTATUSCOMITE")
   private String ESTATUSCOMITE;

@Column(name="TICKETNAOSA")
   private Integer TICKETNAOSA;

@Column(name="INTERNO")
   private String INTERNO;

@Column(name="CXSOP")
   private String CXSOP;

@Column(name="ATCONTACTO")
   private String ATCONTACTO;

@Column(name="ATSTATUS")
   private String ATSTATUS;

@Column(name="ATCOMENTARIO")
   private String ATCOMENTARIO;

@Column(name="ATCTES")
   private String ATCTES;

@Column(name="TIPOTICK")
   private String TIPOTICK;

@Column(name="ID_EMPRESA")
   private Integer ID_EMPRESA;

@Column(name="TIEMPOSOL")
   private Double TIEMPOSOL;

@Column(name="DIFICULTIEMPO")
   private String DIFICULTIEMPO;

@Column(name="TECNICOANT")
   private String TECNICOANT;

@Column(name="CONCILIACIERRE")
   private String CONCILIACIERRE;

@Column(name="INTERFAZ")
   private String INTERFAZ;

@Column(name="SEVERIDAD")
   private String SEVERIDAD;

@Column(name="USR_RESPO")
   private String USR_RESPO;

@Column(name="USR_ASIGNA")
   private String USR_ASIGNA;

@Column(name="HORAS_ESTI")
   private Double HORAS_ESTI;

@Column(name="HORAS_DEDI")
   private Double HORAS_DEDI;

@Column(name="EST_ACTUAL")
   private String EST_ACTUAL;

@Column(name="EST_ACTUAL_FH")
   private Timestamp EST_ACTUAL_FH;

@Column(name="EST_ACTUAL_USR")
   private String EST_ACTUAL_USR;



    @Override
    public String toString() {
        return "DETCLIMO{" + "ID=" + ID + ", RFNCLIENTES=" + RFNCLIENTES + ", FECHA=" + FECHA + ", MOTIVO=" + MOTIVO + ", NUMERACION=" + NUMERACION + ", FECHAVISITA=" + FECHAVISITA + ", FACTURADO=" + FACTURADO + ", TERMINADO=" + TERMINADO + ", TECNICO=" + TECNICO + ", PEDIDOPOR=" + PEDIDOPOR + ", TOMADOPOR=" + TOMADOPOR + ", TRABAJOREALIZADO=" + TRABAJOREALIZADO + ", TIEMPO=" + TIEMPO + ", SOFT=" + SOFT + ", HARD=" + HARD + ", CLIENTE=" + CLIENTE + ", TEMA=" + TEMA + ", TIEMPODIAS=" + TIEMPODIAS + ", FECHAREALIZADO=" + FECHAREALIZADO + ", PRIORIDAD=" + PRIORIDAD + ", EMPEZADA=" + EMPEZADA + ", PRIORIDAD2=" + PRIORIDAD2 + ", P1=" + P1 + ", P2=" + P2 + ", HORAINICIO=" + HORAINICIO + ", HORAFIN=" + HORAFIN + ", NUMPARTE=" + NUMPARTE + ", MOTIVOENLACE=" + MOTIVOENLACE + ", INTEGRATELBASI=" + INTEGRATELBASI + ", INSTAREPA=" + INSTAREPA + ", FECPREVISTA=" + FECPREVISTA + ", FECATENCION=" + FECATENCION + ", FECMATERIAL=" + FECMATERIAL + ", REVISION=" + REVISION + ", EMAIL=" + EMAIL + ", RUTAENLACE=" + RUTAENLACE + ", TICKET=" + TICKET + ", PRIORIDADTOTAL=" + PRIORIDADTOTAL + ", CONCEPTO=" + CONCEPTO + ", FECPROMCLI=" + FECPROMCLI + ", VISTOPOR=" + VISTOPOR + ", RELACION=" + RELACION + ", PROMETIDO=" + PROMETIDO + ", VERSION=" + VERSION + ", SIGTEVERSION=" + SIGTEVERSION + ", INCIDENCIA=" + INCIDENCIA + ", MEDIO=" + MEDIO + ", MODULO=" + MODULO + ", EMAIL2=" + EMAIL2 + ", TIPOINCI=" + TIPOINCI + ", ERRORDE=" + ERRORDE + ", CONCILIADO=" + CONCILIADO + ", SELECCIONADO=" + SELECCIONADO + ", DELIBERANDO=" + DELIBERANDO + ", APLICATIVO=" + APLICATIVO + ", STATUSCOTI=" + STATUSCOTI + ", DOCUMENTADO=" + DOCUMENTADO + ", UBICADOC=" + UBICADOC + ", ESTATUSDOC=" + ESTATUSDOC + ", CATEGORIA=" + CATEGORIA + ", DIFICULTAD=" + DIFICULTAD + ", COMENTARIOS=" + COMENTARIOS + ", LISTAPROV=" + LISTAPROV + ", PRIORIDADORI=" + PRIORIDADORI + ", COMITEDMS=" + COMITEDMS + ", PRIORIDADVW=" + PRIORIDADVW + ", SUBPRIORIVW=" + SUBPRIORIVW + ", APRIMARIA=" + APRIMARIA + ", ASECUNDARIA=" + ASECUNDARIA + ", SIGUENTEACCION=" + SIGUENTEACCION + ", SUBADMON=" + SUBADMON + ", FECHATREAL=" + FECHATREAL + ", COMENTARIOCOMIT=" + COMENTARIOCOMIT + ", COMITE=" + COMITE + ", ESTATUSCOMITE=" + ESTATUSCOMITE + ", TICKETNAOSA=" + TICKETNAOSA + ", INTERNO=" + INTERNO + ", CXSOP=" + CXSOP + ", ATCONTACTO=" + ATCONTACTO + ", ATSTATUS=" + ATSTATUS + ", ATCOMENTARIO=" + ATCOMENTARIO + ", ATCTES=" + ATCTES + ", TIPOTICK=" + TIPOTICK + ", ID_EMPRESA=" + ID_EMPRESA + ", TIEMPOSOL=" + TIEMPOSOL + ", DIFICULTIEMPO=" + DIFICULTIEMPO + ", TECNICOANT=" + TECNICOANT + ", CONCILIACIERRE=" + CONCILIACIERRE + ", INTERFAZ=" + INTERFAZ + ", SEVERIDAD=" + SEVERIDAD + ", USR_RESPO=" + USR_RESPO + ", USR_ASIGNA=" + USR_ASIGNA + ", HORAS_ESTI=" + HORAS_ESTI + ", HORAS_DEDI=" + HORAS_DEDI + ", EST_ACTUAL=" + EST_ACTUAL + ", EST_ACTUAL_FH=" + EST_ACTUAL_FH + ", EST_ACTUAL_USR=" + EST_ACTUAL_USR + '}';
    }

    public DETCLIMO() {
    }

    public DETCLIMO(Integer ID) {
        this.ID = ID;
    }

    public DETCLIMO(Integer RFNCLIENTES, Timestamp FECHA, Blob MOTIVO, Integer NUMERACION, Timestamp FECHAVISITA, String FACTURADO, String TERMINADO, String TECNICO, String PEDIDOPOR, String TOMADOPOR, Blob TRABAJOREALIZADO, Timestamp TIEMPO, String SOFT, String HARD, String CLIENTE, String TEMA, Double TIEMPODIAS, Timestamp FECHAREALIZADO, String PRIORIDAD, String EMPEZADA, String PRIORIDAD2, Double P1, Double P2, Timestamp HORAINICIO, Timestamp HORAFIN, Integer NUMPARTE, Blob MOTIVOENLACE, String INTEGRATELBASI, String INSTAREPA, Timestamp FECPREVISTA, Timestamp FECATENCION, Timestamp FECMATERIAL, String REVISION, String EMAIL, String RUTAENLACE, String TICKET, Double PRIORIDADTOTAL, String CONCEPTO, Timestamp FECPROMCLI, String VISTOPOR, String RELACION, String PROMETIDO, String VERSION, String SIGTEVERSION, String INCIDENCIA, String MEDIO, String MODULO, String EMAIL2, String TIPOINCI, String ERRORDE, String CONCILIADO, String SELECCIONADO, String DELIBERANDO, String APLICATIVO, String STATUSCOTI, String DOCUMENTADO, String UBICADOC, String ESTATUSDOC, String CATEGORIA, String DIFICULTAD, String COMENTARIOS, String LISTAPROV, String PRIORIDADORI, String COMITEDMS, String PRIORIDADVW, String SUBPRIORIVW, String APRIMARIA, String ASECUNDARIA, String SIGUENTEACCION, String SUBADMON, Timestamp FECHATREAL, String COMENTARIOCOMIT, String COMITE, String ESTATUSCOMITE, Integer TICKETNAOSA, String INTERNO, String CXSOP, String ATCONTACTO, String ATSTATUS, String ATCOMENTARIO, String ATCTES, String TIPOTICK, Integer ID_EMPRESA, Double TIEMPOSOL, String DIFICULTIEMPO, String TECNICOANT, String CONCILIACIERRE, String INTERFAZ, String SEVERIDAD, String USR_RESPO, String USR_ASIGNA, Double HORAS_ESTI, Double HORAS_DEDI, String EST_ACTUAL, Timestamp EST_ACTUAL_FH, String EST_ACTUAL_USR) {
        this.RFNCLIENTES = RFNCLIENTES;
        this.FECHA = FECHA;
        this.MOTIVO = MOTIVO;
        this.NUMERACION = NUMERACION;
        this.FECHAVISITA = FECHAVISITA;
        this.FACTURADO = FACTURADO;
        this.TERMINADO = TERMINADO;
        this.TECNICO = TECNICO;
        this.PEDIDOPOR = PEDIDOPOR;
        this.TOMADOPOR = TOMADOPOR;
        this.TRABAJOREALIZADO = TRABAJOREALIZADO;
        this.TIEMPO = TIEMPO;
        this.SOFT = SOFT;
        this.HARD = HARD;
        this.CLIENTE = CLIENTE;
        this.TEMA = TEMA;
        this.TIEMPODIAS = TIEMPODIAS;
        this.FECHAREALIZADO = FECHAREALIZADO;
        this.PRIORIDAD = PRIORIDAD;
        this.EMPEZADA = EMPEZADA;
        this.PRIORIDAD2 = PRIORIDAD2;
        this.P1 = P1;
        this.P2 = P2;
        this.HORAINICIO = HORAINICIO;
        this.HORAFIN = HORAFIN;
        this.NUMPARTE = NUMPARTE;
        this.MOTIVOENLACE = MOTIVOENLACE;
        this.INTEGRATELBASI = INTEGRATELBASI;
        this.INSTAREPA = INSTAREPA;
        this.FECPREVISTA = FECPREVISTA;
        this.FECATENCION = FECATENCION;
        this.FECMATERIAL = FECMATERIAL;
        this.REVISION = REVISION;
        this.EMAIL = EMAIL;
        this.RUTAENLACE = RUTAENLACE;
        this.TICKET = TICKET;
        this.PRIORIDADTOTAL = PRIORIDADTOTAL;
        this.CONCEPTO = CONCEPTO;
        this.FECPROMCLI = FECPROMCLI;
        this.VISTOPOR = VISTOPOR;
        this.RELACION = RELACION;
        this.PROMETIDO = PROMETIDO;
        this.VERSION = VERSION;
        this.SIGTEVERSION = SIGTEVERSION;
        this.INCIDENCIA = INCIDENCIA;
        this.MEDIO = MEDIO;
        this.MODULO = MODULO;
        this.EMAIL2 = EMAIL2;
        this.TIPOINCI = TIPOINCI;
        this.ERRORDE = ERRORDE;
        this.CONCILIADO = CONCILIADO;
        this.SELECCIONADO = SELECCIONADO;
        this.DELIBERANDO = DELIBERANDO;
        this.APLICATIVO = APLICATIVO;
        this.STATUSCOTI = STATUSCOTI;
        this.DOCUMENTADO = DOCUMENTADO;
        this.UBICADOC = UBICADOC;
        this.ESTATUSDOC = ESTATUSDOC;
        this.CATEGORIA = CATEGORIA;
        this.DIFICULTAD = DIFICULTAD;
        this.COMENTARIOS = COMENTARIOS;
        this.LISTAPROV = LISTAPROV;
        this.PRIORIDADORI = PRIORIDADORI;
        this.COMITEDMS = COMITEDMS;
        this.PRIORIDADVW = PRIORIDADVW;
        this.SUBPRIORIVW = SUBPRIORIVW;
        this.APRIMARIA = APRIMARIA;
        this.ASECUNDARIA = ASECUNDARIA;
        this.SIGUENTEACCION = SIGUENTEACCION;
        this.SUBADMON = SUBADMON;
        this.FECHATREAL = FECHATREAL;
        this.COMENTARIOCOMIT = COMENTARIOCOMIT;
        this.COMITE = COMITE;
        this.ESTATUSCOMITE = ESTATUSCOMITE;
        this.TICKETNAOSA = TICKETNAOSA;
        this.INTERNO = INTERNO;
        this.CXSOP = CXSOP;
        this.ATCONTACTO = ATCONTACTO;
        this.ATSTATUS = ATSTATUS;
        this.ATCOMENTARIO = ATCOMENTARIO;
        this.ATCTES = ATCTES;
        this.TIPOTICK = TIPOTICK;
        this.ID_EMPRESA = ID_EMPRESA;
        this.TIEMPOSOL = TIEMPOSOL;
        this.DIFICULTIEMPO = DIFICULTIEMPO;
        this.TECNICOANT = TECNICOANT;
        this.CONCILIACIERRE = CONCILIACIERRE;
        this.INTERFAZ = INTERFAZ;
        this.SEVERIDAD = SEVERIDAD;
        this.USR_RESPO = USR_RESPO;
        this.USR_ASIGNA = USR_ASIGNA;
        this.HORAS_ESTI = HORAS_ESTI;
        this.HORAS_DEDI = HORAS_DEDI;
        this.EST_ACTUAL = EST_ACTUAL;
        this.EST_ACTUAL_FH = EST_ACTUAL_FH;
        this.EST_ACTUAL_USR = EST_ACTUAL_USR;
    }

   
   
   
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRFNCLIENTES() {
        return RFNCLIENTES;
    }

    public void setRFNCLIENTES(Integer RFNCLIENTES) {
        this.RFNCLIENTES = RFNCLIENTES;
    }

    public Timestamp getFECHA() {
        return FECHA;
    }

    public void setFECHA(Timestamp FECHA) {
        this.FECHA = FECHA;
    }

    public Blob getMOTIVO() {
        return MOTIVO;
    }

    public void setMOTIVO(Blob MOTIVO) {
        this.MOTIVO = MOTIVO;
    }

    public Integer getNUMERACION() {
        return NUMERACION;
    }

    public void setNUMERACION(Integer NUMERACION) {
        this.NUMERACION = NUMERACION;
    }

    public Timestamp getFECHAVISITA() {
        return FECHAVISITA;
    }

    public void setFECHAVISITA(Timestamp FECHAVISITA) {
        this.FECHAVISITA = FECHAVISITA;
    }

    public String getFACTURADO() {
        return FACTURADO;
    }

    public void setFACTURADO(String FACTURADO) {
        this.FACTURADO = FACTURADO;
    }

    public String getTERMINADO() {
        return TERMINADO;
    }

    public void setTERMINADO(String TERMINADO) {
        this.TERMINADO = TERMINADO;
    }

    public String getTECNICO() {
        return TECNICO;
    }

    public void setTECNICO(String TECNICO) {
        this.TECNICO = TECNICO;
    }

    public String getPEDIDOPOR() {
        return PEDIDOPOR;
    }

    public void setPEDIDOPOR(String PEDIDOPOR) {
        this.PEDIDOPOR = PEDIDOPOR;
    }

    public String getTOMADOPOR() {
        return TOMADOPOR;
    }

    public void setTOMADOPOR(String TOMADOPOR) {
        this.TOMADOPOR = TOMADOPOR;
    }

    public Blob getTRABAJOREALIZADO() {
        return TRABAJOREALIZADO;
    }

    public void setTRABAJOREALIZADO(Blob TRABAJOREALIZADO) {
        this.TRABAJOREALIZADO = TRABAJOREALIZADO;
    }

    public Timestamp getTIEMPO() {
        return TIEMPO;
    }

    public void setTIEMPO(Timestamp TIEMPO) {
        this.TIEMPO = TIEMPO;
    }

    public String getSOFT() {
        return SOFT;
    }

    public void setSOFT(String SOFT) {
        this.SOFT = SOFT;
    }

    public String getHARD() {
        return HARD;
    }

    public void setHARD(String HARD) {
        this.HARD = HARD;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public String getTEMA() {
        return TEMA;
    }

    public void setTEMA(String TEMA) {
        this.TEMA = TEMA;
    }

    public Double getTIEMPODIAS() {
        return TIEMPODIAS;
    }

    public void setTIEMPODIAS(Double TIEMPODIAS) {
        this.TIEMPODIAS = TIEMPODIAS;
    }

    public Timestamp getFECHAREALIZADO() {
        return FECHAREALIZADO;
    }

    public void setFECHAREALIZADO(Timestamp FECHAREALIZADO) {
        this.FECHAREALIZADO = FECHAREALIZADO;
    }

    public String getPRIORIDAD() {
        return PRIORIDAD;
    }

    public void setPRIORIDAD(String PRIORIDAD) {
        this.PRIORIDAD = PRIORIDAD;
    }

    public String getEMPEZADA() {
        return EMPEZADA;
    }

    public void setEMPEZADA(String EMPEZADA) {
        this.EMPEZADA = EMPEZADA;
    }

    public String getPRIORIDAD2() {
        return PRIORIDAD2;
    }

    public void setPRIORIDAD2(String PRIORIDAD2) {
        this.PRIORIDAD2 = PRIORIDAD2;
    }

    public Double getP1() {
        return P1;
    }

    public void setP1(Double P1) {
        this.P1 = P1;
    }

    public Double getP2() {
        return P2;
    }

    public void setP2(Double P2) {
        this.P2 = P2;
    }

    public Timestamp getHORAINICIO() {
        return HORAINICIO;
    }

    public void setHORAINICIO(Timestamp HORAINICIO) {
        this.HORAINICIO = HORAINICIO;
    }

    public Timestamp getHORAFIN() {
        return HORAFIN;
    }

    public void setHORAFIN(Timestamp HORAFIN) {
        this.HORAFIN = HORAFIN;
    }

    public Integer getNUMPARTE() {
        return NUMPARTE;
    }

    public void setNUMPARTE(Integer NUMPARTE) {
        this.NUMPARTE = NUMPARTE;
    }

    public Blob getMOTIVOENLACE() {
        return MOTIVOENLACE;
    }

    public void setMOTIVOENLACE(Blob MOTIVOENLACE) {
        this.MOTIVOENLACE = MOTIVOENLACE;
    }

    public String getINTEGRATELBASI() {
        return INTEGRATELBASI;
    }

    public void setINTEGRATELBASI(String INTEGRATELBASI) {
        this.INTEGRATELBASI = INTEGRATELBASI;
    }

    public String getINSTAREPA() {
        return INSTAREPA;
    }

    public void setINSTAREPA(String INSTAREPA) {
        this.INSTAREPA = INSTAREPA;
    }

    public Timestamp getFECPREVISTA() {
        return FECPREVISTA;
    }

    public void setFECPREVISTA(Timestamp FECPREVISTA) {
        this.FECPREVISTA = FECPREVISTA;
    }

    public Timestamp getFECATENCION() {
        return FECATENCION;
    }

    public void setFECATENCION(Timestamp FECATENCION) {
        this.FECATENCION = FECATENCION;
    }

    public Timestamp getFECMATERIAL() {
        return FECMATERIAL;
    }

    public void setFECMATERIAL(Timestamp FECMATERIAL) {
        this.FECMATERIAL = FECMATERIAL;
    }

    public String getREVISION() {
        return REVISION;
    }

    public void setREVISION(String REVISION) {
        this.REVISION = REVISION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getRUTAENLACE() {
        return RUTAENLACE;
    }

    public void setRUTAENLACE(String RUTAENLACE) {
        this.RUTAENLACE = RUTAENLACE;
    }

    public String getTICKET() {
        return TICKET;
    }

    public void setTICKET(String TICKET) {
        this.TICKET = TICKET;
    }

    public Double getPRIORIDADTOTAL() {
        return PRIORIDADTOTAL;
    }

    public void setPRIORIDADTOTAL(Double PRIORIDADTOTAL) {
        this.PRIORIDADTOTAL = PRIORIDADTOTAL;
    }

    public String getCONCEPTO() {
        return CONCEPTO;
    }

    public void setCONCEPTO(String CONCEPTO) {
        this.CONCEPTO = CONCEPTO;
    }

    public Timestamp getFECPROMCLI() {
        return FECPROMCLI;
    }

    public void setFECPROMCLI(Timestamp FECPROMCLI) {
        this.FECPROMCLI = FECPROMCLI;
    }

    public String getVISTOPOR() {
        return VISTOPOR;
    }

    public void setVISTOPOR(String VISTOPOR) {
        this.VISTOPOR = VISTOPOR;
    }

    public String getRELACION() {
        return RELACION;
    }

    public void setRELACION(String RELACION) {
        this.RELACION = RELACION;
    }

    public String getPROMETIDO() {
        return PROMETIDO;
    }

    public void setPROMETIDO(String PROMETIDO) {
        this.PROMETIDO = PROMETIDO;
    }

    public String getVERSION() {
        return VERSION;
    }

    public void setVERSION(String VERSION) {
        this.VERSION = VERSION;
    }

    public String getSIGTEVERSION() {
        return SIGTEVERSION;
    }

    public void setSIGTEVERSION(String SIGTEVERSION) {
        this.SIGTEVERSION = SIGTEVERSION;
    }

    public String getINCIDENCIA() {
        return INCIDENCIA;
    }

    public void setINCIDENCIA(String INCIDENCIA) {
        this.INCIDENCIA = INCIDENCIA;
    }

    public String getMEDIO() {
        return MEDIO;
    }

    public void setMEDIO(String MEDIO) {
        this.MEDIO = MEDIO;
    }

    public String getMODULO() {
        return MODULO;
    }

    public void setMODULO(String MODULO) {
        this.MODULO = MODULO;
    }

    public String getEMAIL2() {
        return EMAIL2;
    }

    public void setEMAIL2(String EMAIL2) {
        this.EMAIL2 = EMAIL2;
    }

    public String getTIPOINCI() {
        return TIPOINCI;
    }

    public void setTIPOINCI(String TIPOINCI) {
        this.TIPOINCI = TIPOINCI;
    }

    public String getERRORDE() {
        return ERRORDE;
    }

    public void setERRORDE(String ERRORDE) {
        this.ERRORDE = ERRORDE;
    }

    public String getCONCILIADO() {
        return CONCILIADO;
    }

    public void setCONCILIADO(String CONCILIADO) {
        this.CONCILIADO = CONCILIADO;
    }

    public String getSELECCIONADO() {
        return SELECCIONADO;
    }

    public void setSELECCIONADO(String SELECCIONADO) {
        this.SELECCIONADO = SELECCIONADO;
    }

    public String getDELIBERANDO() {
        return DELIBERANDO;
    }

    public void setDELIBERANDO(String DELIBERANDO) {
        this.DELIBERANDO = DELIBERANDO;
    }

    public String getAPLICATIVO() {
        return APLICATIVO;
    }

    public void setAPLICATIVO(String APLICATIVO) {
        this.APLICATIVO = APLICATIVO;
    }

    public String getSTATUSCOTI() {
        return STATUSCOTI;
    }

    public void setSTATUSCOTI(String STATUSCOTI) {
        this.STATUSCOTI = STATUSCOTI;
    }

    public String getDOCUMENTADO() {
        return DOCUMENTADO;
    }

    public void setDOCUMENTADO(String DOCUMENTADO) {
        this.DOCUMENTADO = DOCUMENTADO;
    }

    public String getUBICADOC() {
        return UBICADOC;
    }

    public void setUBICADOC(String UBICADOC) {
        this.UBICADOC = UBICADOC;
    }

    public String getESTATUSDOC() {
        return ESTATUSDOC;
    }

    public void setESTATUSDOC(String ESTATUSDOC) {
        this.ESTATUSDOC = ESTATUSDOC;
    }

    public String getCATEGORIA() {
        return CATEGORIA;
    }

    public void setCATEGORIA(String CATEGORIA) {
        this.CATEGORIA = CATEGORIA;
    }

    public String getDIFICULTAD() {
        return DIFICULTAD;
    }

    public void setDIFICULTAD(String DIFICULTAD) {
        this.DIFICULTAD = DIFICULTAD;
    }

    public String getCOMENTARIOS() {
        return COMENTARIOS;
    }

    public void setCOMENTARIOS(String COMENTARIOS) {
        this.COMENTARIOS = COMENTARIOS;
    }

    public String getLISTAPROV() {
        return LISTAPROV;
    }

    public void setLISTAPROV(String LISTAPROV) {
        this.LISTAPROV = LISTAPROV;
    }

    public String getPRIORIDADORI() {
        return PRIORIDADORI;
    }

    public void setPRIORIDADORI(String PRIORIDADORI) {
        this.PRIORIDADORI = PRIORIDADORI;
    }

    public String getCOMITEDMS() {
        return COMITEDMS;
    }

    public void setCOMITEDMS(String COMITEDMS) {
        this.COMITEDMS = COMITEDMS;
    }

    public String getPRIORIDADVW() {
        return PRIORIDADVW;
    }

    public void setPRIORIDADVW(String PRIORIDADVW) {
        this.PRIORIDADVW = PRIORIDADVW;
    }

    public String getSUBPRIORIVW() {
        return SUBPRIORIVW;
    }

    public void setSUBPRIORIVW(String SUBPRIORIVW) {
        this.SUBPRIORIVW = SUBPRIORIVW;
    }

    public String getAPRIMARIA() {
        return APRIMARIA;
    }

    public void setAPRIMARIA(String APRIMARIA) {
        this.APRIMARIA = APRIMARIA;
    }

    public String getASECUNDARIA() {
        return ASECUNDARIA;
    }

    public void setASECUNDARIA(String ASECUNDARIA) {
        this.ASECUNDARIA = ASECUNDARIA;
    }

    public String getSIGUENTEACCION() {
        return SIGUENTEACCION;
    }

    public void setSIGUENTEACCION(String SIGUENTEACCION) {
        this.SIGUENTEACCION = SIGUENTEACCION;
    }

    public String getSUBADMON() {
        return SUBADMON;
    }

    public void setSUBADMON(String SUBADMON) {
        this.SUBADMON = SUBADMON;
    }

    public Timestamp getFECHATREAL() {
        return FECHATREAL;
    }

    public void setFECHATREAL(Timestamp FECHATREAL) {
        this.FECHATREAL = FECHATREAL;
    }

    public String getCOMENTARIOCOMIT() {
        return COMENTARIOCOMIT;
    }

    public void setCOMENTARIOCOMIT(String COMENTARIOCOMIT) {
        this.COMENTARIOCOMIT = COMENTARIOCOMIT;
    }

    public String getCOMITE() {
        return COMITE;
    }

    public void setCOMITE(String COMITE) {
        this.COMITE = COMITE;
    }

    public String getESTATUSCOMITE() {
        return ESTATUSCOMITE;
    }

    public void setESTATUSCOMITE(String ESTATUSCOMITE) {
        this.ESTATUSCOMITE = ESTATUSCOMITE;
    }

    public Integer getTICKETNAOSA() {
        return TICKETNAOSA;
    }

    public void setTICKETNAOSA(Integer TICKETNAOSA) {
        this.TICKETNAOSA = TICKETNAOSA;
    }

    public String getINTERNO() {
        return INTERNO;
    }

    public void setINTERNO(String INTERNO) {
        this.INTERNO = INTERNO;
    }

    public String getCXSOP() {
        return CXSOP;
    }

    public void setCXSOP(String CXSOP) {
        this.CXSOP = CXSOP;
    }

    public String getATCONTACTO() {
        return ATCONTACTO;
    }

    public void setATCONTACTO(String ATCONTACTO) {
        this.ATCONTACTO = ATCONTACTO;
    }

    public String getATSTATUS() {
        return ATSTATUS;
    }

    public void setATSTATUS(String ATSTATUS) {
        this.ATSTATUS = ATSTATUS;
    }

    public String getATCOMENTARIO() {
        return ATCOMENTARIO;
    }

    public void setATCOMENTARIO(String ATCOMENTARIO) {
        this.ATCOMENTARIO = ATCOMENTARIO;
    }

    public String getATCTES() {
        return ATCTES;
    }

    public void setATCTES(String ATCTES) {
        this.ATCTES = ATCTES;
    }

    public String getTIPOTICK() {
        return TIPOTICK;
    }

    public void setTIPOTICK(String TIPOTICK) {
        this.TIPOTICK = TIPOTICK;
    }

    public Integer getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(Integer ID_EMPRESA) {
        this.ID_EMPRESA = ID_EMPRESA;
    }

    public Double getTIEMPOSOL() {
        return TIEMPOSOL;
    }

    public void setTIEMPOSOL(Double TIEMPOSOL) {
        this.TIEMPOSOL = TIEMPOSOL;
    }

    public String getDIFICULTIEMPO() {
        return DIFICULTIEMPO;
    }

    public void setDIFICULTIEMPO(String DIFICULTIEMPO) {
        this.DIFICULTIEMPO = DIFICULTIEMPO;
    }

    public String getTECNICOANT() {
        return TECNICOANT;
    }

    public void setTECNICOANT(String TECNICOANT) {
        this.TECNICOANT = TECNICOANT;
    }

    public String getCONCILIACIERRE() {
        return CONCILIACIERRE;
    }

    public void setCONCILIACIERRE(String CONCILIACIERRE) {
        this.CONCILIACIERRE = CONCILIACIERRE;
    }

    public String getINTERFAZ() {
        return INTERFAZ;
    }

    public void setINTERFAZ(String INTERFAZ) {
        this.INTERFAZ = INTERFAZ;
    }

    public String getSEVERIDAD() {
        return SEVERIDAD;
    }

    public void setSEVERIDAD(String SEVERIDAD) {
        this.SEVERIDAD = SEVERIDAD;
    }

    public String getUSR_RESPO() {
        return USR_RESPO;
    }

    public void setUSR_RESPO(String USR_RESPO) {
        this.USR_RESPO = USR_RESPO;
    }

    public String getUSR_ASIGNA() {
        return USR_ASIGNA;
    }

    public void setUSR_ASIGNA(String USR_ASIGNA) {
        this.USR_ASIGNA = USR_ASIGNA;
    }

    public Double getHORAS_ESTI() {
        return HORAS_ESTI;
    }

    public void setHORAS_ESTI(Double HORAS_ESTI) {
        this.HORAS_ESTI = HORAS_ESTI;
    }

    public Double getHORAS_DEDI() {
        return HORAS_DEDI;
    }

    public void setHORAS_DEDI(Double HORAS_DEDI) {
        this.HORAS_DEDI = HORAS_DEDI;
    }

    public String getEST_ACTUAL() {
        return EST_ACTUAL;
    }

    public void setEST_ACTUAL(String EST_ACTUAL) {
        this.EST_ACTUAL = EST_ACTUAL;
    }

    public Timestamp getEST_ACTUAL_FH() {
        return EST_ACTUAL_FH;
    }

    public void setEST_ACTUAL_FH(Timestamp EST_ACTUAL_FH) {
        this.EST_ACTUAL_FH = EST_ACTUAL_FH;
    }

    public String getEST_ACTUAL_USR() {
        return EST_ACTUAL_USR;
    }

    public void setEST_ACTUAL_USR(String EST_ACTUAL_USR) {
        this.EST_ACTUAL_USR = EST_ACTUAL_USR;
    }
   
   
   
   
    
    
    
}
