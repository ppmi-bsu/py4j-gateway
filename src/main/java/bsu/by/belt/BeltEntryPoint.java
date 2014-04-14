package bsu.by.belt;

import by.bsu.belt.provider.BignKeyPairGenerator;
import by.bsu.belt.xml.BXS;
import by.bsu.belt.xml.CreateBeeSignature;
import by.bsu.belt.xml.VerifySignature;
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

    public VerifySignature getVerificator() {
        return new VerifySignature();
    }

    public BignKeyPairGenerator getKeyManager() {
        return new BignKeyPairGenerator();
    }

    public BXS getBXS() {
        return new BXS();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GatewayServer gatewayServer = new GatewayServer(new BeltEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}
