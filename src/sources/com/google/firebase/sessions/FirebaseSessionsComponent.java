package com.google.firebase.sessions;

import a0.o0;
import android.os.Build;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import jh.h;
import kotlin.jvm.internal.m;
import n5.s0;
import n5.v;
import n5.z;
import n9.q;
import ns.o;
import ry.r;
import wz.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Component
public interface FirebaseSessionsComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Component.Builder
    public interface Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Module
    public interface MainModule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Companion f20891a = Companion.f20892a;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f20892a = new Companion();

            private Companion() {
            }

            public static v a(Companion companion, s0 serializer, q qVar, d dVar, fz.a aVar) {
                r rVar = r.f50854a;
                companion.getClass();
                try {
                    System.loadLibrary("datastore_shared_counter");
                    m.f(serializer, "serializer");
                    return new v(new z(serializer, new o0(dVar, 24), aVar), o.K(new n5.d(rVar, null, 0)), qVar, dVar);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return h.f(serializer, qVar, rVar, dVar, aVar);
                }
            }

            public static void b(File file) throws IOException {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && m.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                        return;
                    } catch (Exception e8) {
                        throw new IOException("Failed to create directory: " + parentFile, e8);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }
        }
    }

    FirebaseSessions a();

    SharedSessionRepository b();
}
