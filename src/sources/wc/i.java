package wc;

import android.content.Context;
import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import fr.p3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f54975d;

    public /* synthetic */ i(Context context, String str, String str2, int i11) {
        this.f54972a = i11;
        this.f54973b = context;
        this.f54974c = str;
        this.f54975d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c9  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        h hVar;
        a0 a0Var;
        boolean z11;
        h hVar2;
        Pair pair;
        a0 a0VarH;
        hd.b bVar;
        switch (this.f54972a) {
            case 0:
                Context context = (Context) this.f54973b;
                String str = this.f54974c;
                String str2 = (String) this.f54975d;
                hd.d dVar = d.f54944b;
                if (dVar == null) {
                    synchronized (hd.d.class) {
                        try {
                            dVar = d.f54944b;
                            if (dVar == null) {
                                Context applicationContext = context.getApplicationContext();
                                hd.b bVar2 = d.f54945c;
                                if (bVar2 == null) {
                                    synchronized (hd.b.class) {
                                        try {
                                            bVar = d.f54945c;
                                            if (bVar == null) {
                                                bVar = new hd.b(new gb.m(applicationContext), 0);
                                                d.f54945c = bVar;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    bVar2 = bVar;
                                }
                                dVar = new hd.d(0, bVar2, new p3(14));
                                d.f54944b = dVar;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                hd.d dVar2 = dVar;
                ag.c cVarO = null;
                if (str2 != null) {
                    try {
                        File fileM = ((hd.b) dVar2.f32187b).m(str);
                        if (fileM == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(fileM);
                            hd.a aVar = fileM.getAbsolutePath().endsWith(".zip") ? hd.a.ZIP : fileM.getAbsolutePath().endsWith(".gz") ? hd.a.GZIP : hd.a.JSON;
                            fileM.getAbsolutePath();
                            kd.d.a();
                            pair = new Pair(aVar, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        hVar = null;
                    } else {
                        hd.a aVar2 = (hd.a) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        int i11 = hd.c.f32185a[aVar2.ordinal()];
                        if (i11 == 1) {
                            a0VarH = l.h(context, new ZipInputStream(inputStream), str2);
                        } else if (i11 != 2) {
                            a0VarH = l.e(m00.b.i(inputStream), str2);
                        } else {
                            try {
                                a0VarH = l.e(m00.b.i(new GZIPInputStream(inputStream)), str2);
                            } catch (IOException e8) {
                                a0VarH = new a0(e8);
                            }
                        }
                        hVar = a0VarH.f54933a;
                        if (hVar == null) {
                            hVar = null;
                        }
                    }
                    break;
                } else {
                    hVar = null;
                }
                if (hVar == null) {
                    kd.d.a();
                    kd.d.a();
                    try {
                        try {
                            try {
                                cVarO = p3.o(str);
                                HttpURLConnection httpURLConnection = (HttpURLConnection) cVarO.f701b;
                                try {
                                    z11 = httpURLConnection.getResponseCode() / 100 == 2;
                                } catch (IOException unused2) {
                                }
                                if (z11) {
                                    a0Var = dVar2.q(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                                    h hVar3 = a0Var.f54933a;
                                    kd.d.a();
                                } else {
                                    a0Var = new a0(new IllegalArgumentException(cVarO.a()));
                                }
                            } catch (Throwable th4) {
                                if (0 == 0) {
                                    throw th4;
                                }
                                try {
                                    cVarO.close();
                                    throw th4;
                                } catch (IOException e10) {
                                    kd.d.c("LottieFetchResult close failed ", e10);
                                    throw th4;
                                }
                            }
                        } catch (Exception e11) {
                            a0Var = new a0(e11);
                            if (0 != 0) {
                            }
                            if (str2 != null) {
                                dd.h.f23381b.f23382a.q(str2, hVar2);
                            }
                            return a0Var;
                        }
                        cVarO.close();
                    } catch (IOException e12) {
                        kd.d.c("LottieFetchResult close failed ", e12);
                    }
                    break;
                } else {
                    a0Var = new a0(hVar);
                }
                if (str2 != null && (hVar2 = a0Var.f54933a) != null) {
                    dd.h.f23381b.f23382a.q(str2, hVar2);
                }
                return a0Var;
            case 1:
                return l.b((Context) this.f54973b, this.f54974c, (String) this.f54975d);
            default:
                gb.d dVar3 = (gb.d) this.f54973b;
                ArrayList arrayList = (ArrayList) this.f54975d;
                String str3 = this.f54974c;
                WorkDatabase workDatabase = dVar3.f28921e;
                arrayList.addAll(workDatabase.F().s(str3));
                return workDatabase.E().n(str3);
        }
    }

    public /* synthetic */ i(gb.d dVar, ArrayList arrayList, String str) {
        this.f54972a = 2;
        this.f54973b = dVar;
        this.f54975d = arrayList;
        this.f54974c = str;
    }
}
