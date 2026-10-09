package rt;

import android.os.Bundle;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonStudyActivity;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m5 implements av.l, tx.d, tx.c, vv.a, wa.m, zd.r, td.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f50058b;

    public /* synthetic */ m5(int i11, boolean z11) {
        this.f50057a = i11;
    }

    @Override // av.l
    public void a() throws IllegalAccessException, InvocationTargetException {
        switch (this.f50057a) {
            case 0:
                rz.t tVar = (rz.t) this.f50058b;
                if (!tVar.H()) {
                    tVar.J(qy.b0.f48488a);
                }
                break;
            default:
                uz.i1 i1Var = ((sv.d) this.f50058b).f51798c;
                i1Var.getClass();
                i1Var.l(null, BuildConfig.VERSION_NAME);
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f50057a) {
            case 4:
                Boolean bool = (Boolean) obj;
                tp.h hVar = (tp.h) this.f50058b;
                lc.d dVar = hVar.O;
                if (dVar != null) {
                    dVar.dismiss();
                }
                ta.a aVar = hVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.g3) aVar).f32613b.setVisibility(0);
                ta.a aVar2 = hVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.g3) aVar2).f32614c.setVisibility(0);
                kotlin.jvm.internal.m.c(bool);
                if (!bool.booleanValue()) {
                    String string = hVar.getString(R.string.error);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    ff.h.C(string);
                } else {
                    String string2 = hVar.getString(R.string.successfully_saved_to_device_album);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    ff.h.C(string2);
                }
                break;
            case 5:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((tp.i0) this.f50058b).A();
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                yi.b bVar = (yi.b) this.f50058b;
                PinyinLessonStudyActivity pinyinLessonStudyActivity = bVar.f57846a;
                int size = arrayList.size();
                if (size <= 0) {
                    pinyinLessonStudyActivity.v(false);
                    pinyinLessonStudyActivity.u(BuildConfig.VERSION_NAME, true);
                } else {
                    pinyinLessonStudyActivity.v(true);
                    fv.c cVar = bVar.f57848c;
                    kotlin.jvm.internal.m.c(cVar);
                    cVar.c(arrayList, new fn.b(bVar, size, 3), false);
                }
                break;
        }
    }

    @Override // tx.d
    public Object apply(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.m.f(it, "it");
        sh.c cVar = (sh.c) this.f50058b;
        cVar.getClass();
        cVar.N = it;
        return Boolean.TRUE;
    }

    @Override // vv.a
    public void b() throws IOException {
        ((URLConnection) this.f50058b).connect();
    }

    @Override // vv.a
    public boolean c() throws ProtocolException {
        URLConnection uRLConnection = (URLConnection) this.f50058b;
        if (!(uRLConnection instanceof HttpURLConnection)) {
            return false;
        }
        ((HttpURLConnection) uRLConnection).setRequestMethod("HEAD");
        return true;
    }

    @Override // vv.a
    public InputStream e() {
        return ((URLConnection) this.f50058b).getInputStream();
    }

    @Override // vv.a
    public Map f() {
        return ((URLConnection) this.f50058b).getHeaderFields();
    }

    @Override // wa.m
    public String[] g() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f50058b).getSupportedFeatures();
    }

    @Override // wa.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) o00.a.g(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f50058b).getStatics());
    }

    @Override // wa.m
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) o00.a.g(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f50058b).getWebkitToCompatConverter());
    }

    @Override // td.d
    public boolean h(Object obj, File file, td.j jVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        m0.n nVar = (m0.n) this.f50058b;
        byte[] bArr = (byte[]) nVar.d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i11);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    nVar.i(bArr);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    nVar.i(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            nVar.i(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // vv.a
    public int i() {
        URLConnection uRLConnection = (URLConnection) this.f50058b;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // vv.a
    public void j(String str, String str2) {
        ((URLConnection) this.f50058b).addRequestProperty(str, str2);
    }

    @Override // vv.a
    public String k(String str) {
        return ((URLConnection) this.f50058b).getHeaderField(str);
    }

    @Override // vv.a
    public void l() {
        try {
            ((URLConnection) this.f50058b).getInputStream().close();
        } catch (IOException unused) {
        }
    }

    @Override // vv.a
    public Map m() {
        return ((URLConnection) this.f50058b).getRequestProperties();
    }

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new zd.c((zd.x) this.f50058b, 1);
    }

    public /* synthetic */ m5(Object obj, int i11) {
        this.f50057a = i11;
        this.f50058b = obj;
    }

    public m5(int i11) {
        this.f50057a = i11;
        switch (i11) {
            case 11:
                this.f50058b = new zd.x(7);
                break;
            case 12:
            default:
                this.f50058b = new Bundle();
                break;
            case 13:
                this.f50058b = ef.e.d(new ys.c3(12));
                break;
        }
    }
}
