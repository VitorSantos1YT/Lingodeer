package com.lingo.lingoskill.base.refill;

import ay.g0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.lingo.lingoskill.object.TranlateObject;
import java.util.ArrayList;
import java.util.Iterator;
import o20.t0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends com.lingo.lingoskill.http.service.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21731a;

    public k(String url, int i11) {
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(url, "url");
                this.f21731a = (n) com.google.android.material.datepicker.d.i(n.class, url, "create(...)");
                break;
            default:
                this.f21731a = (i) com.google.android.material.datepicker.d.i(i.class, url, "create(...)");
                break;
        }
    }

    public static final ArrayList b(k kVar, t0 t0Var) throws JSONException {
        kVar.getClass();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject((String) t0Var.f44599b);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
            try {
                arrayList.add((TranlateObject) new Gson().fromJson(jSONObject2.toString(), TranlateObject.class));
            } catch (JsonSyntaxException e8) {
                jSONObject2.toString();
                e8.printStackTrace();
            }
        }
        return arrayList;
    }

    public g0 c(String filePath) {
        kotlin.jvm.internal.m.f(filePath, "filePath");
        return ((i) this.f21731a).v().f(new a(filePath, 6));
    }
}
