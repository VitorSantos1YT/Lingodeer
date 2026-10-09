package n00;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import m00.a0;
import m00.h0;
import m00.i0;
import m00.o;
import m00.w;
import m00.x;
import qy.l;
import qy.q;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f43069f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassLoader f43070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f43071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f43072e;

    static {
        String str = a0.f40673b;
        f43069f = p20.c.m("/");
    }

    public e(ClassLoader classLoader) {
        x systemFileSystem = o.f40737a;
        m.f(systemFileSystem, "systemFileSystem");
        this.f43070c = classLoader;
        this.f43071d = systemFileSystem;
        this.f43072e = com.bumptech.glide.d.v(new lt.e(this, 4));
    }

    @Override // m00.o
    public final h0 a(a0 file) throws IOException {
        m.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // m00.o
    public final void b(a0 source, a0 target) throws IOException {
        m.f(source, "source");
        m.f(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // m00.o
    public final void d(a0 dir) throws IOException {
        m.f(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // m00.o
    public final void e(a0 path) throws IOException {
        m.f(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // m00.o
    public final List i(a0 dir) throws FileNotFoundException {
        m.f(dir, "dir");
        a0 a0Var = f43069f;
        a0Var.getClass();
        String strV = c.b(a0Var, dir, true).c(a0Var).f40674a.v();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z11 = false;
        for (l lVar : (List) this.f43072e.getValue()) {
            o oVar = (o) lVar.f48495a;
            a0 a0Var2 = (a0) lVar.f48496b;
            try {
                List listI = oVar.i(a0Var2.e(strV));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (p20.c.b((a0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    a0 a0Var3 = (a0) obj2;
                    m.f(a0Var3, "<this>");
                    arrayList2.add(a0Var.e(oz.x.p0(oz.q.R0(a0Var3.f40674a.v(), a0Var2.f40674a.v()), '\\', '/')));
                }
                ry.m.d0(linkedHashSet, arrayList2);
                z11 = true;
            } catch (IOException unused) {
            }
        }
        if (z11) {
            return ry.m.a1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // m00.o
    public final e4.e q(a0 path) {
        m.f(path, "path");
        if (!p20.c.b(path)) {
            return null;
        }
        a0 a0Var = f43069f;
        a0Var.getClass();
        String strV = c.b(a0Var, path, true).c(a0Var).f40674a.v();
        for (l lVar : (List) this.f43072e.getValue()) {
            e4.e eVarQ = ((o) lVar.f48495a).q(((a0) lVar.f48496b).e(strV));
            if (eVarQ != null) {
                return eVarQ;
            }
        }
        return null;
    }

    @Override // m00.o
    public final w v(a0 a0Var) throws FileNotFoundException {
        if (!p20.c.b(a0Var)) {
            throw new FileNotFoundException("file not found: " + a0Var);
        }
        a0 a0Var2 = f43069f;
        a0Var2.getClass();
        String strV = c.b(a0Var2, a0Var, true).c(a0Var2).f40674a.v();
        for (l lVar : (List) this.f43072e.getValue()) {
            try {
                return ((o) lVar.f48495a).v(((a0) lVar.f48496b).e(strV));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + a0Var);
    }

    @Override // m00.o
    public final h0 x(a0 file) throws IOException {
        m.f(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // m00.o
    public final i0 y(a0 file) throws IOException {
        m.f(file, "file");
        if (!p20.c.b(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        a0 a0Var = f43069f;
        a0Var.getClass();
        URL resource = this.f43070c.getResource(c.b(a0Var, file, false).c(a0Var).f40674a.v());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        m.e(inputStream, "getInputStream(...)");
        return m00.b.i(inputStream);
    }
}
