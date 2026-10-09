package e6;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlanceRemoteViewsService f25043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25046d;

    public s0(GlanceRemoteViewsService glanceRemoteViewsService, int i11, int i12, String str) {
        this.f25043a = glanceRemoteViewsService;
        this.f25044b = i11;
        this.f25045c = i12;
        this.f25046d = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(s0 s0Var, c cVar, xy.c cVar2) throws Throwable {
        r0 r0Var;
        xq.c cVar3;
        ComponentName componentName;
        String className;
        rz.g1 g1Var;
        if (cVar2 instanceof r0) {
            r0Var = (r0) cVar2;
            int i11 = r0Var.f25038d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f25038d = i11 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(s0Var, cVar2);
            }
        } else {
            r0Var = new r0(s0Var, cVar2);
        }
        Object objA = r0Var.f25036b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = r0Var.f25038d;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        if (i12 != 0) {
            if (i12 == 1) {
                s0Var = r0Var.f25035a;
                com.bumptech.glide.e.F(objA);
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objA);
                    return b0Var;
                }
                com.bumptech.glide.e.F(objA);
                g1Var = (rz.g1) objA;
            }
            if (g1Var != null) {
                r0Var.f25035a = null;
                r0Var.f25038d = 3;
                if (g1Var.join(r0Var) == aVar) {
                    return aVar;
                }
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(objA);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(s0Var.f25043a).getAppWidgetInfo(s0Var.f25044b);
        if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
            cVar3 = null;
        } else {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.m.d(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver");
            cVar3 = ((DayStreakWidgetReceiver) objNewInstance).f22194b;
        }
        if (cVar3 == null) {
            x xVar = UnmanagedSessionReceiver.f1908a;
            x.a(s0Var.f25044b);
            g1Var = null;
            if (g1Var != null) {
                r0Var.f25035a = null;
                r0Var.f25038d = 3;
                if (g1Var.join(r0Var) == aVar) {
                }
            }
            return b0Var;
        }
        m6.m mVar = m6.n.f40911a;
        b0.f fVar = new b0.f(s0Var, cVar, cVar3, dVar, 15);
        r0Var.f25035a = s0Var;
        r0Var.f25038d = 1;
        objA = mVar.a(fVar, r0Var);
        if (objA != aVar) {
            s0Var = s0Var;
        }
        return aVar;
        g1Var = (rz.g1) objA;
        if (g1Var == null) {
            x xVar2 = UnmanagedSessionReceiver.f1908a;
            x.a(s0Var.f25044b);
            g1Var = null;
        }
        if (g1Var != null) {
            r0Var.f25035a = null;
            r0Var.f25038d = 3;
            if (g1Var.join(r0Var) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    public final h1 b() {
        h1 h1Var;
        i1 i1Var = GlanceRemoteViewsService.f1907a;
        int i11 = this.f25044b;
        int i12 = this.f25045c;
        String str = this.f25046d;
        i1 i1Var2 = GlanceRemoteViewsService.f1907a;
        synchronized (i1Var2) {
            h1Var = (h1) i1Var2.f24942a.get(i1.c(i11, i12, str));
            if (h1Var == null) {
                h1Var = h1.f24929d;
            }
        }
        return h1Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().f24930a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i11) {
        try {
            return b().f24930a[i11];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i11) {
        try {
            return b().f24931b[i11];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f25043a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().f24932c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() throws Throwable {
        rz.e0.F(vy.j.f54321a, new b0.a1(this, null, 24));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        i1 i1Var = GlanceRemoteViewsService.f1907a;
        int i11 = this.f25044b;
        int i12 = this.f25045c;
        String str = this.f25046d;
        i1 i1Var2 = GlanceRemoteViewsService.f1907a;
        synchronized (i1Var2) {
            i1Var2.f24942a.remove(i1.c(i11, i12, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
