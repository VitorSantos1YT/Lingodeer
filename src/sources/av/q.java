package av;

import android.content.Context;
import android.os.SystemClock;
import com.yalantis.ucrop.view.CropImageView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rz.o0;
import uz.i1;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f3184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f3185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a00.e f3186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f3187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f3188e;

    public q(Context context) {
        File file = new File(context.getNoBackupFilesDir(), "skegn");
        this.f3184a = file;
        File file2 = new File(file, "native_cn.res");
        this.f3185b = file2;
        this.f3186c = new a00.e();
        i1 i1VarC = x0.c(d(file2) ? d0.f3116a : c0.f3113a);
        this.f3187d = i1VarC;
        this.f3188e = new r0(i1VarC);
    }

    public static File b(File file) {
        Object next;
        cz.j direction = cz.j.TOP_DOWN;
        kotlin.jvm.internal.m.f(direction, "direction");
        cz.g gVar = new cz.g(new cz.i(file, direction));
        while (true) {
            if (!gVar.hasNext()) {
                next = null;
                break;
            }
            next = gVar.next();
            File file2 = (File) next;
            if (file2.isFile() && kotlin.jvm.internal.m.a(file2.getName(), "native_cn.res") && file2.length() > 0) {
                break;
            }
        }
        File file3 = (File) next;
        if (file3 != null) {
            return file3;
        }
        throw new IllegalStateException("压缩包中缺少 native_cn.res".toString());
    }

    public static boolean d(File file) {
        return file.isFile() && file.length() > 0;
    }

    public static void f(File file) {
        if (file.exists()) {
            file.length();
        }
    }

    public static void g(File file, File file2) throws IOException {
        String strM = defpackage.e.m(file2.getCanonicalPath(), File.separator);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                File file3 = new File(file2, nextEntry.getName());
                String canonicalPath = file3.getCanonicalPath();
                kotlin.jvm.internal.m.e(canonicalPath, "getCanonicalPath(...)");
                if (!oz.x.s0(canonicalPath, strM, false)) {
                    throw new IllegalStateException(("压缩包包含非法路径: " + nextEntry.getName()).toString());
                }
                if (nextEntry.isDirectory()) {
                    file3.mkdirs();
                } else {
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                    try {
                        md.a.e(zipInputStream, bufferedOutputStream, 65536);
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ns.o.m(bufferedOutputStream, th2);
                            throw th3;
                        }
                    }
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ns.o.m(zipInputStream, th4);
                throw th5;
            }
        }
    }

    public final void a(InputStream inputStream, BufferedOutputStream bufferedOutputStream, Long l9) throws IOException {
        byte[] bArr = new byte[65536];
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = inputStream.read(bArr);
        long j11 = 0;
        int iIntValue = -5;
        while (i11 >= 0) {
            bufferedOutputStream.write(bArr, 0, i11);
            j11 += (long) i11;
            Integer numValueOf = null;
            if (l9 != null) {
                a0 a0Var = new a0(Float.valueOf(hz.b.k(j11 / l9.longValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)));
                i1 i1Var = this.f3187d;
                i1Var.getClass();
                i1Var.l(null, a0Var);
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (l9 != null) {
                numValueOf = Integer.valueOf((int) hz.b.n((100 * j11) / l9.longValue(), 0L, 100L));
            }
            if ((numValueOf != null && numValueOf.intValue() >= iIntValue + 5) || jElapsedRealtime2 - jElapsedRealtime >= 1000) {
                if (numValueOf != null) {
                    w4.c.f(numValueOf.intValue(), "%");
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue() - (numValueOf.intValue() % 5);
                }
                jElapsedRealtime = jElapsedRealtime2;
            }
            i11 = inputStream.read(bArr);
        }
    }

    public final void c(File file, File file2) throws IOException {
        File file3 = new File(this.f3184a, defpackage.e.m(file2.getName(), ".part"));
        file3.delete();
        cz.k.Q(file, file3);
        if (!d(file3)) {
            throw new IllegalStateException(("解压后的 " + file2.getName() + " 无效").toString());
        }
        file3.length();
        file2.delete();
        if (file3.renameTo(file2)) {
            return;
        }
        cz.k.Q(file3, file2);
        file3.delete();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [av.o, vy.d] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a00.a, a00.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object e(xy.c cVar) throws Throwable {
        ?? oVar;
        long jElapsedRealtime;
        int i11;
        ?? r9;
        ?? r11;
        ?? r12;
        ?? r13;
        boolean zD;
        if (cVar instanceof o) {
            o oVar2 = (o) cVar;
            int i12 = oVar2.f3181f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                oVar2.f3181f = i12 - Integer.MIN_VALUE;
                oVar = oVar2;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f3179d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = oVar.f3181f;
        b0 b0Var = b0.f3112a;
        Object obj2 = d0.f3116a;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        File file = this.f3185b;
        i1 i1Var = this.f3187d;
        vy.d dVar = null;
        try {
            try {
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    Object value = i1Var.getValue();
                    ?? r14 = this.f3186c;
                    r14.f();
                    file.exists();
                    f(file);
                    Objects.toString(value);
                    oVar.f3177b = r14;
                    oVar.f3176a = jElapsedRealtime;
                    oVar.f3178c = 0;
                    oVar.f3181f = 1;
                    if (r14.b(oVar) != aVar) {
                        i11 = 0;
                        r9 = r14;
                    }
                    return aVar;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r11 = oVar.f3177b;
                    try {
                        com.bumptech.glide.e.F(obj);
                        r11 = r11;
                        zD = d(file);
                        if (zD) {
                            obj2 = b0Var;
                        }
                        i1Var.getClass();
                        i1Var.l(null, obj2);
                        Object value2 = i1Var.getValue();
                        f(file);
                        SystemClock.elapsedRealtime();
                        Objects.toString(value2);
                        z11 = zD;
                        r13 = r11;
                    } catch (CancellationException e8) {
                        e = e8;
                        c0 c0Var = c0.f3113a;
                        i1Var.getClass();
                        i1Var.l(null, c0Var);
                        SystemClock.elapsedRealtime();
                        throw e;
                    } catch (Exception unused) {
                        SystemClock.elapsedRealtime();
                        i1Var.getClass();
                        i1Var.l(null, b0Var);
                        r13 = r11;
                    }
                    z13 = z11;
                    r12 = r13;
                    Boolean boolValueOf = Boolean.valueOf(z13);
                    r12.a(null);
                    return boolValueOf;
                }
                int i14 = oVar.f3178c;
                jElapsedRealtime = oVar.f3176a;
                a00.a aVar2 = oVar.f3177b;
                com.bumptech.glide.e.F(obj);
                i11 = i14;
                r9 = aVar2;
                SystemClock.elapsedRealtime();
                Object value3 = i1Var.getValue();
                file.exists();
                f(file);
                Objects.toString(value3);
                if (d(file)) {
                    i1Var.getClass();
                    i1Var.l(null, obj2);
                    r12 = r9;
                } else {
                    a0 a0Var = new a0(null);
                    i1Var.getClass();
                    i1Var.l(null, a0Var);
                    try {
                        yz.f fVar = o0.f50940a;
                        yz.e eVar = yz.e.f58387a;
                        p pVar = new p(this, dVar, z12 ? 1 : 0);
                        oVar.f3177b = r9;
                        oVar.f3176a = jElapsedRealtime;
                        oVar.f3178c = i11;
                        oVar.f3181f = 2;
                        if (rz.e0.M(eVar, pVar, oVar) != aVar) {
                            r11 = r9;
                            zD = d(file);
                            if (zD) {
                                obj2 = b0Var;
                            }
                            i1Var.getClass();
                            i1Var.l(null, obj2);
                            Object value4 = i1Var.getValue();
                            f(file);
                            SystemClock.elapsedRealtime();
                            Objects.toString(value4);
                            z11 = zD;
                            r13 = r11;
                            z13 = z11;
                            r12 = r13;
                        }
                        return aVar;
                    } catch (CancellationException e10) {
                        e = e10;
                        c0 c0Var2 = c0.f3113a;
                        i1Var.getClass();
                        i1Var.l(null, c0Var2);
                        SystemClock.elapsedRealtime();
                        throw e;
                    } catch (Exception unused2) {
                        r11 = r9;
                        SystemClock.elapsedRealtime();
                        i1Var.getClass();
                        i1Var.l(null, b0Var);
                        r13 = r11;
                    }
                }
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                r12.a(null);
                return boolValueOf2;
            } catch (Throwable th2) {
                th = th2;
                oVar = r9;
                oVar.a(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
