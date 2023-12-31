// Figura 8.1: Time1.java
// Declara��o de classe Time1 mat�m a hora no formato 24h

public class Time1
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // configura um novo valor de hora usando formato universal;
    // assegura que os dados permane�am consistentes configurando valores inv�lidos como zero
    public void setTime( int h, int m, int s){
        hour = ( ( h >= 0 && h < 24) ? h : 0 ); // valida horas
        minute = ( ( m >= 0 && m < 59 ) ? m : 0 ); // valida minutos
        second = ( ( s >= 0 && m < 59 ) ? s : 0 ); // valida segundos
    } // fim do m�todo setTime

    // conver em String no formato de hora universal (hh:mm:ss)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", 
            hour, minute, second);
    } // fim do m�todo toUniversalString

    // converte em String no formato padr�o hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s", 
            ( ( hour == 0 || hour == 12) ? 12 : hour % 12 ), minute, 
                second, ( hour < 12 ? "AM": "PM ") );
    } // fim do m�todo toString
} // fim da classe Time1