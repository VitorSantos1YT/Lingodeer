package lf;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f40072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f40073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f40074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40075d;

    public n0(long j11, o0 o0Var, File file, String str) {
        this.f40072a = j11;
        this.f40073b = o0Var;
        this.f40074c = file;
        this.f40075d = str;
    }

    public final void a() {
        String string;
        o0 o0Var = this.f40073b;
        long j11 = o0Var.f40088f.get();
        long j12 = this.f40072a;
        File file = this.f40074c;
        if (j12 < j11) {
            file.delete();
            return;
        }
        File file2 = o0Var.f40084b;
        byte[] bytes = this.f40075d.getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            MessageDigest hash = MessageDigest.getInstance("MD5");
            kotlin.jvm.internal.m.e(hash, "hash");
            hash.update(bytes);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.m.e(digest, "digest");
            for (byte b3 : digest) {
                sb2.append(Integer.toHexString((b3 >> 4) & 15));
                sb2.append(Integer.toHexString(b3 & 15));
            }
            string = sb2.toString();
            kotlin.jvm.internal.m.e(string, "builder.toString()");
        } catch (NoSuchAlgorithmException unused) {
            string = null;
        }
        if (!file.renameTo(new File(file2, string))) {
            file.delete();
        }
        ReentrantLock reentrantLock = o0Var.f40086d;
        reentrantLock.lock();
        try {
            if (!o0Var.f40085c) {
                o0Var.f40085c = true;
                re.s.d().execute(new i0(o0Var, 0));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
