package bsu.by.belt;

import by.bsu.belt.xml.CreateBeeSignature;
import py4j.GatewayServer;

/**
 * Hello world!
 *
 */
public class BeltEntryPoint
{
    public CreateBeeSignature getSigner(){
        return new CreateBeeSignature();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GatewayServer gatewayServer = new GatewayServer(new BeltEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}
