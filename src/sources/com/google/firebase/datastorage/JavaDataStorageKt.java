package com.google.firebase.datastorage;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import r5.b;
import r5.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaDataStorageKt {
    public static final Object a(b bVar, d key, Serializable serializable) {
        m.f(bVar, "<this>");
        m.f(key, "key");
        Object objC = bVar.c(key);
        return objC == null ? serializable : objC;
    }
}
