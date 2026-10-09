package mo;

import android.net.Uri;
import ar.f;
import av.t;
import bm.c;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import fv.d;
import java.io.Serializable;
import java.util.ArrayList;
import k7.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import ob.e;
import oo.h;
import p7.v0;
import re.v;
import x7.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f41172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f41173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41174d;

    public /* synthetic */ b(Object obj, Serializable serializable, Serializable serializable2, int i11) {
        this.f41171a = i11;
        this.f41174d = obj;
        this.f41172b = serializable;
        this.f41173c = serializable2;
    }

    @Override // fv.d
    public final void a(uv.b task) {
        switch (this.f41171a) {
            case 0:
            case 1:
            case 2:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f41171a) {
            case 0:
                m.f(task, "task");
                ((bm.a) this.f41174d).f4461c = task.a();
                break;
            case 1:
                m.f(task, "task");
                ((c) this.f41174d).f4466c = task.a();
                break;
            case 2:
                m.f(task, "task");
                break;
            default:
                ((rp.b) this.f41174d).f49335c = task != null ? task.a() : -1;
                break;
        }
    }

    @Override // fv.d
    public final void c(uv.b task) {
        int i11 = this.f41171a;
        Serializable serializable = this.f41173c;
        Object obj = this.f41174d;
        Serializable serializable2 = this.f41172b;
        switch (i11) {
            case 0:
                m.f(task, "task");
                w wVar = (w) serializable2;
                int i12 = wVar.f38359a + 1;
                wVar.f38359a = i12;
                if (i12 == ((ArrayList) serializable).size()) {
                    ((h) ((bm.a) obj).f4459a).A("100 %", true);
                }
                break;
            case 1:
                m.f(task, "task");
                w wVar2 = (w) serializable2;
                int i13 = wVar2.f38359a + 1;
                wVar2.f38359a = i13;
                if (i13 == ((ArrayList) serializable).size()) {
                    ((oo.m) ((c) obj).f4464a).A("100 %", true);
                }
                break;
            case 2:
                m.f(task, "task");
                w wVar3 = (w) serializable2;
                int i14 = wVar3.f38359a + 1;
                wVar3.f38359a = i14;
                ((t) obj).invoke(Integer.valueOf((int) ((i14 / ((ArrayList) serializable).size()) * 100)));
                break;
            default:
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                Uri uri = Uri.parse(x.n().tempDir + ((String) serializable2));
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                m.c(lingoSkillApplication2);
                e eVar = new e(lingoSkillApplication2);
                hh.c cVar = new hh.c(new k(), 16);
                v vVar = new v(2);
                y6.x xVarA = y6.x.a(uri);
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                ((rp.b) obj).f49333a.postValue(new v0(xVarA, eVar, cVar, g.f37960a, vVar, 1048576, null));
                break;
        }
    }

    @Override // fv.d
    public final void d(uv.b task) {
        switch (this.f41171a) {
            case 0:
            case 1:
            case 2:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f41171a) {
            case 0:
                m.f(task, "task");
                ((h) ((bm.a) this.f41174d).f4459a).A(w4.c.f((int) ((i11 / i12) * 100), " %"), false);
                break;
            case 1:
                m.f(task, "task");
                ((oo.m) ((c) this.f41174d).f4464a).A(w4.c.f((int) ((i11 / i12) * 100), " %"), false);
                break;
            case 2:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        switch (this.f41171a) {
            case 0:
                m.f(task, "task");
                break;
            case 1:
                m.f(task, "task");
                break;
            case 2:
                m.f(task, "task");
                w wVar = (w) this.f41172b;
                int i11 = wVar.f38359a + 1;
                wVar.f38359a = i11;
                ((t) this.f41174d).invoke(Integer.valueOf((int) ((i11 / ((ArrayList) this.f41173c).size()) * 100)));
                break;
            default:
                Uri uri = Uri.parse((String) this.f41173c);
                f fVar = new f(2, (byte) 0);
                hh.c cVar = new hh.c(new k(), 16);
                v vVar = new v(2);
                y6.x xVarA = y6.x.a(uri);
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                xVarA.f57373b.getClass();
                ((rp.b) this.f41174d).f49333a.postValue(new v0(xVarA, fVar, cVar, g.f37960a, vVar, 1048576, null));
                break;
        }
    }

    public b(w wVar, t tVar, ArrayList arrayList) {
        this.f41171a = 2;
        this.f41172b = wVar;
        this.f41174d = tVar;
        this.f41173c = arrayList;
    }

    private final void g(uv.b bVar) {
    }

    private final void i(uv.b bVar) {
    }

    private final void h(uv.b bVar, int i11, int i12) {
    }
}
