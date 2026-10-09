package um;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.adjust.sdk.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.m;
import lf.i0;
import rt.qf;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Typeface f53019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f53020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f53021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f53022d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Handler f53023e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ExecutorService f53024f = Executors.newSingleThreadExecutor();

    public static final void a(TextView textView) {
        m.f(textView, "<this>");
        if (!m.a(Looper.myLooper(), Looper.getMainLooper())) {
            f53023e.post(new i0(textView, 15));
            return;
        }
        Typeface typeface = f53019a;
        if (typeface != null) {
            textView.setTypeface(typeface);
            return;
        }
        WeakReference weakReference = new WeakReference(textView);
        Context context = textView.getContext();
        m.e(context, "getContext(...)");
        b(context, new u(weakReference, 14));
    }

    public static final void b(Context context, fz.a aVar) {
        boolean zA = m.a(Looper.myLooper(), Looper.getMainLooper());
        Handler handler = f53023e;
        if (!zA) {
            handler.post(new pb.b(15, context, aVar));
            return;
        }
        if (f53019a != null) {
            handler.post(new qf(1, aVar));
            return;
        }
        if (!f53020b || f53021c) {
            f53022d.add(aVar);
            if (f53021c) {
                return;
            }
            f53021c = true;
            f53020b = true;
            f53024f.execute(new s(context.getApplicationContext(), 4));
        }
    }
}
