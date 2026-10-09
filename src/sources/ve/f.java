package ve;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import ns.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.x;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f53989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f53990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f53991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53992d;

    public f(View view, Handler handler, HashSet listenerSet, String str) {
        m.f(handler, "handler");
        m.f(listenerSet, "listenerSet");
        this.f53989a = new WeakReference(view);
        this.f53991c = listenerSet;
        this.f53992d = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(e eVar, View view, we.c cVar) {
        View viewA = eVar.a();
        if (viewA == null) {
            return;
        }
        String str = eVar.f53988b;
        View.OnClickListener onClickListenerE = we.h.e(viewA);
        boolean z11 = (onClickListenerE instanceof a) && ((a) onClickListenerE).f53972e;
        HashSet hashSet = this.f53991c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        a aVar = null;
        if (!qf.a.b(c.class)) {
            try {
                a aVar2 = new a();
                aVar2.f53968a = cVar;
                aVar2.f53969b = new WeakReference(viewA);
                aVar2.f53970c = new WeakReference(view);
                aVar2.f53971d = we.h.e(viewA);
                aVar2.f53972e = true;
                aVar = aVar2;
            } catch (Throwable th2) {
                qf.a.a(c.class, th2);
            }
        }
        viewA.setOnClickListener(aVar);
        hashSet.add(str);
    }

    public final void b(e eVar, View view, we.c cVar) {
        AdapterView adapterView = (AdapterView) eVar.a();
        if (adapterView == null) {
            return;
        }
        String str = eVar.f53988b;
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        boolean z11 = (onItemClickListener instanceof b) && ((b) onItemClickListener).f53977e;
        HashSet hashSet = this.f53991c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        b bVar = null;
        if (!qf.a.b(c.class)) {
            try {
                b bVar2 = new b();
                bVar2.f53973a = cVar;
                bVar2.f53974b = new WeakReference(adapterView);
                bVar2.f53975c = new WeakReference(view);
                bVar2.f53976d = adapterView.getOnItemClickListener();
                bVar2.f53977e = true;
                bVar = bVar2;
            } catch (Throwable th2) {
                qf.a.a(c.class, th2);
            }
        }
        adapterView.setOnItemClickListener(bVar);
        hashSet.add(str);
    }

    public final void c(e eVar, View view, we.c cVar) {
        View viewA = eVar.a();
        if (viewA == null) {
            return;
        }
        String str = eVar.f53988b;
        View.OnTouchListener onTouchListenerF = we.h.f(viewA);
        boolean z11 = (onTouchListenerF instanceof h) && ((h) onTouchListenerF).f54004e;
        HashSet hashSet = this.f53991c;
        if (hashSet.contains(str) || z11) {
            return;
        }
        h hVar = null;
        if (!qf.a.b(i.class)) {
            try {
                hVar = new h(cVar, view, viewA);
            } catch (Throwable th2) {
                qf.a.a(i.class, th2);
            }
        }
        viewA.setOnTouchListener(hVar);
        hashSet.add(str);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00be A[Catch: Exception -> 0x00c3, TryCatch #3 {Exception -> 0x00c3, blocks: (B:49:0x00b6, B:51:0x00be, B:53:0x00c5, B:47:0x00b0, B:33:0x007e, B:42:0x00a1, B:44:0x00a9, B:39:0x0098), top: B:77:0x00b6, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #3 {Exception -> 0x00c3, blocks: (B:49:0x00b6, B:51:0x00be, B:53:0x00c5, B:47:0x00b0, B:33:0x007e, B:42:0x00a1, B:44:0x00a9, B:39:0x0098), top: B:77:0x00b6, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:55:0x00d0, B:58:0x00d7, B:60:0x00db, B:61:0x00df, B:63:0x00e3), top: B:73:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00db A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:55:0x00d0, B:58:0x00d7, B:60:0x00db, B:61:0x00df, B:63:0x00e3), top: B:73:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00df A[Catch: Exception -> 0x00e8, TryCatch #1 {Exception -> 0x00e8, blocks: (B:55:0x00d0, B:58:0x00d7, B:60:0x00db, B:61:0x00df, B:63:0x00e3), top: B:73:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3 A[Catch: Exception -> 0x00e8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e8, blocks: (B:55:0x00d0, B:58:0x00d7, B:60:0x00db, B:61:0x00df, B:63:0x00e3), top: B:73:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public final void d() {
        int i11;
        ?? Equals;
        View view;
        ArrayList arrayList = this.f53990b;
        if (arrayList != null) {
            WeakReference weakReference = this.f53989a;
            if (weakReference.get() != null) {
                int size = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    we.c cVar = (we.c) arrayList.get(i13);
                    View view2 = (View) weakReference.get();
                    if (cVar != null) {
                        String str = cVar.f55098d;
                        if (view2 != null) {
                            int length = str.length();
                            String str2 = this.f53992d;
                            if (length == 0 || str.equals(str2)) {
                                List listUnmodifiableList = Collections.unmodifiableList(cVar.f55096b);
                                m.e(listUnmodifiableList, "unmodifiableList(path)");
                                if (listUnmodifiableList.size() <= 25) {
                                    ArrayList arrayListO = i.o(view2, listUnmodifiableList, i12, -1, str2);
                                    int size2 = arrayListO.size();
                                    int i14 = i12;
                                    while (i14 < size2) {
                                        int i15 = i14 + 1;
                                        e eVar = (e) arrayListO.get(i14);
                                        try {
                                            View viewA = eVar.a();
                                            if (viewA == null) {
                                                i11 = i12;
                                            } else {
                                                we.h hVar = we.h.f55112a;
                                                if (qf.a.b(we.h.class)) {
                                                    view = null;
                                                    if (view == null) {
                                                        try {
                                                            if (we.h.f55112a.l(viewA, view)) {
                                                                c(eVar, view2, cVar);
                                                                i11 = 0;
                                                            } else {
                                                                i11 = 0;
                                                                try {
                                                                    if (!x.s0(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                                        if (!(viewA instanceof AdapterView)) {
                                                                            a(eVar, view2, cVar);
                                                                        } else if (viewA instanceof ListView) {
                                                                            b(eVar, view2, cVar);
                                                                        }
                                                                    }
                                                                } catch (Exception unused) {
                                                                    qf.a.b(g.class);
                                                                    s sVar = s.f49201a;
                                                                }
                                                            }
                                                        } catch (Exception unused2) {
                                                            i11 = 0;
                                                            qf.a.b(g.class);
                                                            s sVar2 = s.f49201a;
                                                            i14 = i15;
                                                            i12 = i11;
                                                        }
                                                    } else {
                                                        i11 = 0;
                                                        if (!x.s0(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                            if (!(viewA instanceof AdapterView)) {
                                                                a(eVar, view2, cVar);
                                                            } else if (viewA instanceof ListView) {
                                                                b(eVar, view2, cVar);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    View view3 = viewA;
                                                    while (true) {
                                                        if (view3 != null) {
                                                            try {
                                                                we.h hVar2 = we.h.f55112a;
                                                                if (qf.a.b(hVar2)) {
                                                                    Equals = i12;
                                                                } else {
                                                                    try {
                                                                        Equals = view3.getClass().getName().equals("com.facebook.react.ReactRootView");
                                                                    } catch (Throwable th2) {
                                                                        qf.a.a(hVar2, th2);
                                                                        Equals = 0;
                                                                    }
                                                                }
                                                                if (Equals != 0) {
                                                                    view = view3;
                                                                    break;
                                                                }
                                                                Object parent = view3.getParent();
                                                                if (parent instanceof View) {
                                                                    view3 = (View) parent;
                                                                    i12 = 0;
                                                                }
                                                            } catch (Throwable th3) {
                                                                qf.a.a(we.h.class, th3);
                                                            }
                                                        }
                                                        view = null;
                                                        break;
                                                    }
                                                    if (view == null) {
                                                        i11 = 0;
                                                        if (!x.s0(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                            if (!(viewA instanceof AdapterView)) {
                                                                a(eVar, view2, cVar);
                                                            } else if (viewA instanceof ListView) {
                                                                b(eVar, view2, cVar);
                                                            }
                                                        }
                                                    } else if (we.h.f55112a.l(viewA, view)) {
                                                        c(eVar, view2, cVar);
                                                        i11 = 0;
                                                    } else {
                                                        i11 = 0;
                                                        if (!x.s0(viewA.getClass().getName(), "com.facebook.react", false)) {
                                                            if (!(viewA instanceof AdapterView)) {
                                                                a(eVar, view2, cVar);
                                                            } else if (viewA instanceof ListView) {
                                                                b(eVar, view2, cVar);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception unused3) {
                                            i11 = i12;
                                        }
                                        i14 = i15;
                                        i12 = i11;
                                    }
                                }
                            }
                        }
                    }
                    i13++;
                    i12 = i12;
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarB = h0.b(s.b());
            if (e0VarB != null && e0VarB.f40006j) {
                JSONArray jSONArray = e0VarB.f40007k;
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null) {
                    try {
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i11);
                            m.e(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(o.z(jSONObject));
                        }
                    } catch (IllegalArgumentException | JSONException unused) {
                    }
                }
                this.f53990b = arrayList;
                View view = (View) this.f53989a.get();
                if (view == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    viewTreeObserver.addOnScrollChangedListener(this);
                }
                d();
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
