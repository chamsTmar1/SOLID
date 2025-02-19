package com.directi.training.dip.solution;

import java.io.IOException;

public class EncodingClient
{
    public static void main(String[] args) throws IOException
    {
        IEncoding encodingWithFiles = new EncodingWithFiles();
        encodingWithFiles.encode();

        IEncoding encodingBasedOnNetworkAndDatabase = new EncodingBasedOnNetworkAndDatabase();
        encodingBasedOnNetworkAndDatabase.encode();
    }
}
