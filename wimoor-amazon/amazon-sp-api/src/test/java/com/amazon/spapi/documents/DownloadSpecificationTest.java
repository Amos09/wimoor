package com.amazon.spapi.documents;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DownloadSpecificationTest {

    @Test
    public void testBuilderConstructorMissingCryptoStreamFactory() throws Exception {
        CryptoStreamFactory cryptoStreamFactory = null;
        String url = "https://www.amazon.com";

        assertThrows(IllegalArgumentException.class, () ->
                new DownloadSpecification.Builder(cryptoStreamFactory, url));
    }

    @Test
    public void testBuilderConstructorMissingUrl() throws Exception {
        CryptoStreamFactory cryptoStreamFactory = Mockito.mock(CryptoStreamFactory.class);
        String url = null;

        assertThrows(IllegalArgumentException.class, () ->
                new DownloadSpecification.Builder(cryptoStreamFactory, url));
    }

    @Test
    public void testSuccess() throws Exception {
        CryptoStreamFactory cryptoStreamFactory = Mockito.mock(CryptoStreamFactory.class);
        String url = "http://abc.com/123";

        DownloadSpecification spec = new DownloadSpecification.Builder(cryptoStreamFactory, url).build();

        assertNull(spec.getCompressionAlgorithm());
        assertSame(cryptoStreamFactory, spec.getCryptoStreamFactory());
        assertEquals(url, spec.getUrl());
    }

    @Test
    public void testCompressionAlgorithm() throws Exception {
        CompressionAlgorithm compressionAlgorithm = CompressionAlgorithm.GZIP;
        CryptoStreamFactory cryptoStreamFactory = Mockito.mock(CryptoStreamFactory.class);
        String url = "http://abc.com/123";

        DownloadSpecification spec = new DownloadSpecification.Builder(cryptoStreamFactory, url)
                .withCompressionAlgorithm(compressionAlgorithm)
                .build();

        assertEquals(compressionAlgorithm, spec.getCompressionAlgorithm());
        assertSame(cryptoStreamFactory, spec.getCryptoStreamFactory());
        assertEquals(url, spec.getUrl());
    }
}