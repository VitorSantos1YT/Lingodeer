package z2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.lingodeer.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f58726a = new LinkedHashMap();

    public static final uz.g1 a(Context context) {
        uz.g1 g1Var;
        LinkedHashMap linkedHashMap = f58726a;
        synchronized (linkedHashMap) {
            try {
                Object objA = linkedHashMap.get(context);
                if (objA == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    tz.h hVarB = qx.p.b(-1, 6, null);
                    gp.r rVar = new gp.r(new av.e(contentResolver, uriFor, new i5.a(hVarB, md.a.h(Looper.getMainLooper())), hVarB, context, null));
                    rz.b2 b2VarE = rz.e0.e();
                    yz.f fVar = rz.o0.f50940a;
                    objA = uz.x0.A(rVar, new wz.d(ew.a.w(b2VarE, wz.m.f55536a)), uz.a1.a(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objA);
                }
                g1Var = (uz.g1) objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g1Var;
    }

    public static final l1.w b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof l1.w) {
            return (l1.w) tag;
        }
        return null;
    }
}
