package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import h00.c;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.m;
import m00.h;
import n5.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionDataSerializer implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionGenerator f20933a;

    public SessionDataSerializer(SessionGenerator sessionGenerator) {
        m.f(sessionGenerator, "sessionGenerator");
        this.f20933a = sessionGenerator;
    }

    @Override // n5.s0
    public final Object a() {
        return new SessionData(this.f20933a.a(null), null, null);
    }

    @Override // n5.s0
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            h00.b bVar = c.f29915d;
            String str = new String(md.a.t(fileInputStream), oz.a.f46133a);
            bVar.getClass();
            return (SessionData) bVar.b(SessionData.Companion.serializer(), str);
        } catch (Exception e8) {
            throw new CorruptionException("Cannot parse session data", e8);
        }
    }

    @Override // n5.s0
    public final void c(Object obj, h hVar) throws IOException {
        byte[] bytes = c.f29915d.c(SessionData.Companion.serializer(), (SessionData) obj).getBytes(oz.a.f46133a);
        m.e(bytes, "getBytes(...)");
        hVar.write(bytes);
    }
}
