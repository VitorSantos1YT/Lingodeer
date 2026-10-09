package m00;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class x extends o {
    @Override // m00.o
    public final h0 a(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return new c(1, new FileOutputStream(file.toFile(), true), new k0());
    }

    @Override // m00.o
    public void b(a0 source, a0 target) throws IOException {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // m00.o
    public final void e(a0 path) throws IOException {
        kotlin.jvm.internal.m.f(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // m00.o
    public final List i(a0 dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        File file = dir.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.m.c(str);
            arrayList.add(dir.e(str));
        }
        ry.p.Y(arrayList);
        return arrayList;
    }

    @Override // m00.o
    public e4.e q(a0 path) {
        kotlin.jvm.internal.m.f(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new e4.e(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // m00.o
    public final w v(a0 a0Var) {
        return new w(new RandomAccessFile(a0Var.toFile(), "r"));
    }

    @Override // m00.o
    public final h0 x(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return new c(1, new FileOutputStream(file.toFile(), false), new k0());
    }

    @Override // m00.o
    public final i0 y(a0 file) {
        kotlin.jvm.internal.m.f(file, "file");
        return new d(new FileInputStream(file.toFile()), k0.f40719d);
    }

    @Override // m00.o
    public final void d(a0 dir) throws IOException {
        kotlin.jvm.internal.m.f(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        e4.e eVarQ = q(dir);
        if (eVarQ == null || !eVarQ.f24792c) {
            throw new IOException(PQgum.DMkyFVsgtRscGb + dir);
        }
    }
}
