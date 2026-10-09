package gn;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;
import kr.r1;
import rt.bb;
import rt.cb;
import rt.db;
import rt.qd;
import rt.we;
import rt.xe;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29320d;

    public /* synthetic */ d(ViewModel viewModel, int i11, File file, int i12) {
        this.f29317a = i12;
        this.f29319c = viewModel;
        this.f29318b = i11;
        this.f29320d = file;
    }

    @Override // fv.d
    public final void a(uv.b task) {
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                qd.a((qd) this.f29319c, this.f29318b);
                break;
            default:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                ((e) this.f29319c).f29327t = task.a();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                m.f(task, "task");
                ((tq.d) this.f29319c).f52528f = task.a();
                break;
        }
    }

    @Override // fv.d
    public final void c(uv.b task) {
        Object value;
        int size;
        int i11;
        Object weVar;
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                e eVar = (e) this.f29319c;
                e0.B(ViewModelKt.getViewModelScope(eVar), null, null, new c(this.f29318b, 0, eVar, (File) this.f29320d, null), 3);
                break;
            case 1:
                i1 i1Var = ((r1) this.f29320d).f38573c;
                m.f(task, "task");
                List list = (List) this.f29319c;
                Iterator it = list.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                    } else if (!m.a(((fv.a) it.next()).f28182a, task.f53184e)) {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    list.remove(i12);
                }
                do {
                    value = i1Var.getValue();
                    size = list.size();
                    i11 = this.f29318b;
                } while (!i1Var.j(value, new db((i11 - size) / i11)));
                if (list.isEmpty()) {
                    i1Var.getClass();
                    i1Var.l(null, cb.f49585a);
                }
                break;
            case 2:
                m.f(task, "task");
                w wVar = (w) this.f29320d;
                int i13 = wVar.f38359a + 1;
                wVar.f38359a = i13;
                fz.c cVar = (fz.c) this.f29319c;
                int i14 = this.f29318b;
                cVar.invoke(new db(i13 / i14));
                if (wVar.f38359a == i14) {
                    cVar.invoke(cb.f49585a);
                }
                break;
            case 3:
                i1 i1Var2 = ((bb) this.f29320d).K;
                m.f(task, "task");
                List list2 = (List) this.f29319c;
                Iterator it2 = list2.iterator();
                int i15 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i15 = -1;
                    } else if (!m.a(((fv.a) it2.next()).f28182a, task.f53184e)) {
                        i15++;
                    }
                }
                if (i15 != -1) {
                    list2.remove(i15);
                }
                int size2 = list2.size();
                int i16 = this.f29318b;
                db dbVar = new db((i16 - size2) / i16);
                i1Var2.getClass();
                i1Var2.l(null, dbVar);
                if (list2.isEmpty()) {
                    i1Var2.getClass();
                    i1Var2.l(null, cb.f49585a);
                }
                break;
            case 4:
                File file = (File) this.f29320d;
                qd qdVar = (qd) this.f29319c;
                Integer num = qdVar.H;
                if (num != null) {
                    int iIntValue = num.intValue();
                    int i17 = this.f29318b;
                    if (iIntValue == i17) {
                        i1 i1Var3 = qdVar.f50314t;
                        if (file.exists()) {
                            String absolutePath = file.getAbsolutePath();
                            m.e(absolutePath, "getAbsolutePath(...)");
                            weVar = new we(absolutePath, i17);
                        } else {
                            weVar = xe.f50664a;
                        }
                        i1Var3.getClass();
                        i1Var3.l(null, weVar);
                        break;
                    }
                }
                break;
            default:
                m.f(task, "task");
                tq.d dVar = (tq.d) this.f29319c;
                e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new tq.c(this.f29318b, 0, (File) this.f29320d, dVar, null), 3);
                break;
        }
    }

    @Override // fv.d
    public final void d(uv.b task) {
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                qd.a((qd) this.f29319c, this.f29318b);
                break;
            default:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                float f5 = i12 > 0 ? i11 / i12 : CropImageView.DEFAULT_ASPECT_RATIO;
                i1 i1Var = ((e) this.f29319c).f29324d;
                a aVarA = a.a((a) i1Var.getValue(), false, null, null, null, false, f5, false, 95);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                break;
            case 1:
                break;
            case 2:
                ((fz.c) this.f29319c).invoke(new db((((w) this.f29320d).f38359a + (i12 > 0 ? i11 / i12 : CropImageView.DEFAULT_ASPECT_RATIO)) / this.f29318b));
                break;
            case 3:
            case 4:
                break;
            default:
                m.f(task, "task");
                float f11 = i12 > 0 ? i11 / i12 : CropImageView.DEFAULT_ASPECT_RATIO;
                i1 i1Var2 = ((tq.d) this.f29319c).f52525c;
                tq.a aVarA2 = tq.a.a((tq.a) i1Var2.getValue(), null, null, null, false, f11, false, 95);
                i1Var2.getClass();
                i1Var2.l(null, aVarA2);
                break;
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        Object value;
        int size;
        int i11;
        switch (this.f29317a) {
            case 0:
                m.f(task, "task");
                i1 i1Var = ((e) this.f29319c).f29324d;
                a aVarA = a.a((a) i1Var.getValue(), false, null, null, ep.a.e("下载失败: ", th2.getMessage()), false, CropImageView.DEFAULT_ASPECT_RATIO, false, 39);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                break;
            case 1:
                i1 i1Var2 = ((r1) this.f29320d).f38573c;
                m.f(task, "task");
                List list = (List) this.f29319c;
                Iterator it = list.iterator();
                int i12 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i12 = -1;
                    } else if (!m.a(((fv.a) it.next()).f28182a, task.f53184e)) {
                        i12++;
                    }
                }
                if (i12 != -1) {
                    list.remove(i12);
                }
                do {
                    value = i1Var2.getValue();
                    size = list.size();
                    i11 = this.f29318b;
                } while (!i1Var2.j(value, new db((i11 - size) / i11)));
                if (list.isEmpty()) {
                    i1Var2.getClass();
                    i1Var2.l(null, cb.f49585a);
                }
                break;
            case 2:
                m.f(task, "task");
                w wVar = (w) this.f29320d;
                int i13 = wVar.f38359a + 1;
                wVar.f38359a = i13;
                if (i13 == this.f29318b) {
                    ((fz.c) this.f29319c).invoke(cb.f49585a);
                }
                break;
            case 3:
                i1 i1Var3 = ((bb) this.f29320d).K;
                m.f(task, "task");
                List list2 = (List) this.f29319c;
                Iterator it2 = list2.iterator();
                int i14 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i14 = -1;
                    } else if (!m.a(((fv.a) it2.next()).f28182a, task.f53184e)) {
                        i14++;
                    }
                }
                if (i14 != -1) {
                    list2.remove(i14);
                }
                int size2 = list2.size();
                int i15 = this.f29318b;
                db dbVar = new db((i15 - size2) / i15);
                i1Var3.getClass();
                i1Var3.l(null, dbVar);
                if (list2.isEmpty()) {
                    i1Var3.getClass();
                    i1Var3.l(null, cb.f49585a);
                }
                break;
            case 4:
                qd.a((qd) this.f29319c, this.f29318b);
                break;
            default:
                m.f(task, "task");
                i1 i1Var4 = ((tq.d) this.f29319c).f52525c;
                tq.a aVarA2 = tq.a.a((tq.a) i1Var4.getValue(), null, null, ep.a.e("下载失败: ", th2.getMessage()), false, CropImageView.DEFAULT_ASPECT_RATIO, false, 39);
                i1Var4.getClass();
                i1Var4.l(null, aVarA2);
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i11, int i12, Object obj2) {
        this.f29317a = i12;
        this.f29319c = obj;
        this.f29320d = obj2;
        this.f29318b = i11;
    }

    private final void g(uv.b bVar) {
    }

    private final void h(uv.b bVar) {
    }

    private final void i(uv.b bVar) {
    }

    private final void j(uv.b bVar) {
    }

    private final void k(uv.b bVar) {
    }

    private final void l(uv.b bVar) {
    }

    private final void m(uv.b bVar) {
    }

    private final void q(uv.b bVar) {
    }

    private final void r(uv.b bVar) {
    }

    private final void s(uv.b bVar) {
    }

    private final void n(uv.b bVar, int i11, int i12) {
    }

    private final void o(uv.b bVar, int i11, int i12) {
    }

    private final void p(uv.b bVar, int i11, int i12) {
    }
}
