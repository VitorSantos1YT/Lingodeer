package xt;

import android.content.Context;
import fr.o0;
import java.io.File;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f56254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f56255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f56260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f56261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f56262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f56263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f56264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f56265l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f56266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f56267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f56268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f56269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f56270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f56271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f56272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f56273u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f56274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f56275w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f56276x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f56277y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f56278z;

    public a(Context context, n0 n0Var, q qVar) {
        this.f56254a = n0Var;
        this.f56255b = qVar;
        String strM = defpackage.e.m(context.getFilesDir().getAbsolutePath(), "/data/");
        this.f56256c = strM;
        this.f56257d = defpackage.e.m(strM, "cs/");
        this.f56258e = defpackage.e.m(strM, "js/");
        this.f56259f = defpackage.e.m(strM, "kr/");
        this.f56260g = defpackage.e.m(strM, "en/");
        this.f56261h = defpackage.e.m(strM, "es/");
        this.f56262i = defpackage.e.m(strM, "fr/");
        this.f56263j = defpackage.e.m(strM, "de/");
        this.f56264k = defpackage.e.m(strM, "pt/");
        this.f56265l = defpackage.e.m(strM, "vt/");
        this.m = defpackage.e.m(strM, "ru/");
        this.f56266n = defpackage.e.m(strM, "it/");
        this.f56267o = defpackage.e.m(strM, "cnup/");
        this.f56268p = defpackage.e.m(strM, "jpup/");
        this.f56269q = defpackage.e.m(strM, "krup/");
        this.f56270r = defpackage.e.m(strM, "esus/");
        this.f56271s = defpackage.e.m(strM, "enes/");
        this.f56272t = defpackage.e.m(strM, "frus/");
        this.f56273u = defpackage.e.m(strM, "ar/");
        this.f56274v = defpackage.e.m(strM, "idn/");
        this.f56275w = defpackage.e.m(strM, "pol/");
        this.f56276x = defpackage.e.m(strM, "ukr/");
        this.f56277y = defpackage.e.m(strM, "cze/");
        this.f56278z = defpackage.e.m(strM, "nld/");
        this.A = defpackage.e.m(strM, "nor/");
        this.B = defpackage.e.m(strM, "tur/");
        this.C = defpackage.e.m(strM, "thai/");
        this.D = defpackage.e.m(strM, "hindi/");
        this.E = defpackage.e.m(strM, "grk/");
        this.F = defpackage.e.m(strM, "mal/");
    }

    public static void a(String filePath) {
        File[] fileArrListFiles;
        kotlin.jvm.internal.m.f(filePath, "filePath");
        File file = new File(filePath);
        if (!file.exists() || file.isFile() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        e00.i iVarA = kotlin.jvm.internal.l.a(fileArrListFiles);
        while (iVarA.hasNext()) {
            File file2 = (File) iVarA.next();
            if (kotlin.jvm.internal.m.a(file2.getName(), "database")) {
                file.getAbsolutePath();
            } else if (file2.isFile()) {
                file2.delete();
            } else if (file2.isDirectory()) {
                file2.toString();
                String absolutePath = file2.getAbsolutePath();
                kotlin.jvm.internal.m.e(absolutePath, "getAbsolutePath(...)");
                a(absolutePath);
            }
        }
    }

    public final String b() {
        return this.f56255b.c(null, null) ? defpackage.e.m(e(), "alphabet/m_audio/") : defpackage.e.m(e(), "alphabet/f_audio/");
    }

    public final String c() {
        return defpackage.e.m(e(), "alphabet/f_audio/");
    }

    public final String d() {
        return defpackage.e.m(e(), "alphabet/m_audio/");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x005c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0062  */
    /* JADX WARN: Code duplicated, block: B:55:0x0065  */
    /* JADX WARN: Code duplicated, block: B:57:0x0068  */
    public final String e() {
        int i11 = ((o0) this.f56254a).f27733a.keyLanguage;
        if (i11 != 40) {
            if (i11 == 57) {
                return this.C;
            }
            if (i11 == 61) {
                return this.D;
            }
            if (i11 == 63) {
                return this.f56276x;
            }
            if (i11 == 65) {
                return this.E;
            }
            if (i11 == 69) {
                return this.F;
            }
            switch (i11) {
                case 0:
                    return this.f56257d;
                case 1:
                    return this.f56258e;
                case 2:
                    return this.f56259f;
                case 3:
                    return this.f56260g;
                case 4:
                    return this.f56261h;
                case 5:
                    return this.f56262i;
                case 6:
                    return this.f56263j;
                case 7:
                    return this.f56265l;
                case 8:
                    return this.f56264k;
                default:
                    switch (i11) {
                        case 10:
                        case 22:
                            return this.m;
                        case 11:
                            return this.f56267o;
                        case 12:
                            return this.f56268p;
                        case 13:
                            return this.f56269q;
                        case 14:
                            return this.f56261h;
                        case 15:
                            return this.f56262i;
                        case 16:
                            return this.f56263j;
                        case 17:
                            return this.f56264k;
                        case 18:
                            return this.f56274v;
                        case 19:
                            return this.f56275w;
                        case 20:
                            break;
                        case 21:
                            return this.B;
                        default:
                            switch (i11) {
                                case 47:
                                case 48:
                                    return this.f56270r;
                                case 49:
                                case 50:
                                    return this.f56271s;
                                case 51:
                                    break;
                                default:
                                    switch (i11) {
                                        case 53:
                                        case 54:
                                            return this.f56272t;
                                        case 55:
                                            break;
                                        default:
                                            switch (i11) {
                                                case 100:
                                                    return this.f56277y;
                                                case 101:
                                                    return this.f56278z;
                                                case 102:
                                                    return this.A;
                                                default:
                                                    return this.f56256c;
                                            }
                                    }
                                    break;
                            }
                            return this.f56273u;
                    }
                    break;
            }
        }
        return this.f56266n;
    }

    public final String f() {
        return defpackage.e.m(e(), "fluent/");
    }

    public final String g() {
        return this.f56255b.d(null, null) ? defpackage.e.m(e(), "alphabet/m_audio/") : defpackage.e.m(e(), "alphabet/f_audio/");
    }

    public final String h() {
        return this.f56255b.d(null, null) ? defpackage.e.m(e(), "lesson/m_audio/") : defpackage.e.m(e(), "lesson/f_audio/");
    }

    public final String i() {
        return defpackage.e.m(e(), "lesson/f_audio/");
    }

    public final String j() {
        return defpackage.e.m(e(), "lesson/m_audio/");
    }

    public final String k() {
        return defpackage.e.m(e(), "lesson/pic/");
    }

    public final String l() {
        return defpackage.e.m(e(), "lesson/natural_video/");
    }

    public final String m() {
        return defpackage.e.m(e(), "lesson/normal_video/");
    }

    public final String n() {
        return this.f56255b.e() ? defpackage.e.m(e(), "sc/m_audio/") : defpackage.e.m(e(), "sc/f_audio/");
    }

    public final String o() {
        return this.f56255b.f() ? defpackage.e.m(e(), "story/m_audio/") : defpackage.e.m(e(), "story/f_audio/");
    }

    public final String p() {
        return defpackage.e.m(e(), "story_leadboard/");
    }

    public final String q() {
        return defpackage.e.m(e(), "story/pic/");
    }

    public final String r() {
        return defpackage.e.m(e(), "lesson/video/");
    }
}
