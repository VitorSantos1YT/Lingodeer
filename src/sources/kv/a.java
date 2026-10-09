package kv;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38702a;

    public a(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f38702a = context;
    }

    public final String a(x0 value) {
        String string;
        kotlin.jvm.internal.m.f(value, "value");
        if (value instanceof v0) {
            return ((v0) value).f38826a;
        }
        if (!(value instanceof u0)) {
            if (!(value instanceof w0)) {
                throw new NoWhenBranchMatchedException();
            }
            w0 w0Var = (w0) value;
            return oz.x.q0(a(w0Var.f38827a), w0Var.f38828b, w0Var.f38829c);
        }
        u0 u0Var = (u0) value;
        List list = u0Var.f38821b;
        y0 y0Var = u0Var.f38820a;
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                throw new NoWhenBranchMatchedException();
            }
            throw new ClassCastException();
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        int length = strArr.length;
        Context context = this.f38702a;
        if (length == 0) {
            kotlin.jvm.internal.m.f(y0Var, "<this>");
            string = context.getString(y0Var.a());
        } else {
            kotlin.jvm.internal.m.f(y0Var, "<this>");
            string = context.getString(y0Var.a(), Arrays.copyOf(strArr, strArr.length));
        }
        kotlin.jvm.internal.m.c(string);
        return u0Var.f38822c ? qx.p.K(string) : string;
    }
}
