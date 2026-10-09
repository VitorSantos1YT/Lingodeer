package com.google.common.base;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Charsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f16352a = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f16353b;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        f16353b = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16BE;
        Charset charset3 = StandardCharsets.UTF_16LE;
        Charset charset4 = StandardCharsets.UTF_16;
    }

    private Charsets() {
    }
}
