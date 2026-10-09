package ue;

import android.content.SharedPreferences;
import fr.p3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import lf.j1;
import lf.y0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.b0;
import re.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements re.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52924a;

    public /* synthetic */ e(int i11) {
        this.f52924a = i11;
    }

    @Override // re.u
    public final void a(b0 b0Var) {
        switch (this.f52924a) {
            case 0:
                re.r rVar = b0Var.f49125c;
                boolean zBooleanValue = false;
                Object obj = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                linkedHashMap = null;
                LinkedHashMap linkedHashMap = null;
                if (rVar != null) {
                    p3 p3Var = y0.f40132d;
                    d0 d0Var = d0.APP_EVENTS;
                    p3.s(d0Var, "ue.f", " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", rVar.toString(), String.valueOf(rVar.K));
                    if (!qf.a.b(f.class)) {
                        try {
                            SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                            if (sharedPreferences != null) {
                                y yVar = y.DATASETID;
                                String string = sharedPreferences.getString(yVar.a(), null);
                                y yVar2 = y.URL;
                                String string2 = sharedPreferences.getString(yVar2.a(), null);
                                y yVar3 = y.ACCESSKEY;
                                String string3 = sharedPreferences.getString(yVar3.a(), null);
                                if (string != null && !oz.q.K0(string) && string2 != null && !oz.q.K0(string2) && string3 != null && !oz.q.K0(string3)) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put(yVar2.a(), string2);
                                    linkedHashMap2.put(yVar.a(), string);
                                    linkedHashMap2.put(yVar3.a(), string3);
                                    p3.s(d0Var, "ue.f".toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                                    linkedHashMap = linkedHashMap2;
                                }
                            }
                        } catch (Throwable th2) {
                            qf.a.a(f.class, th2);
                        }
                    }
                    if (linkedHashMap != null) {
                        URL url = new URL(String.valueOf(linkedHashMap.get(y.URL.a())));
                        q.a(String.valueOf(linkedHashMap.get(y.DATASETID.a())), url.getProtocol() + "://" + url.getHost(), String.valueOf(linkedHashMap.get(y.ACCESSKEY.a())));
                        f.f52925a = true;
                    }
                } else {
                    p3 p3Var2 = y0.f40132d;
                    d0 d0Var2 = d0.APP_EVENTS;
                    p3.s(d0Var2, "ue.f", " \n\nGraph Response Received: \n================\n%s\n\n ", b0Var);
                    JSONObject jSONObject = b0Var.f49124b;
                    if (jSONObject != null) {
                        try {
                            obj = jSONObject.get("data");
                        } catch (NullPointerException e8) {
                            p3 p3Var3 = y0.f40132d;
                            p3.s(d0.APP_EVENTS, "ue.f", "CloudBridge Settings API response is not a valid json: \n%s ", cf.x.O(e8));
                            return;
                        } catch (JSONException e10) {
                            p3 p3Var4 = y0.f40132d;
                            p3.s(d0.APP_EVENTS, "ue.f", "CloudBridge Settings API response is not a valid json: \n%s ", cf.x.O(e10));
                            return;
                        }
                    }
                    kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type org.json.JSONArray");
                    HashMap mapH = j1.h(new JSONObject((String) ry.m.s0(j1.g((JSONArray) obj))));
                    String str = (String) mapH.get(y.URL.a());
                    String str2 = (String) mapH.get(y.DATASETID.a());
                    String str3 = (String) mapH.get(y.ACCESSKEY.a());
                    if (str == null || str2 == null || str3 == null) {
                        p3.r(d0Var2, "ue.f", "CloudBridge Settings API response doesn't have valid data");
                    } else {
                        try {
                            q.a(str2, str, str3);
                            f.B(mapH);
                            y yVar4 = y.ENABLED;
                            if (mapH.get(yVar4.a()) != null) {
                                Object obj2 = mapH.get(yVar4.a());
                                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                zBooleanValue = ((Boolean) obj2).booleanValue();
                            }
                            f.f52925a = zBooleanValue;
                        } catch (MalformedURLException e11) {
                            p3 p3Var5 = y0.f40132d;
                            p3.s(d0.APP_EVENTS, "ue.f", "CloudBridge Settings API response doesn't have valid url\n %s ", cf.x.O(e11));
                            return;
                        }
                    }
                }
                break;
            default:
                p3 p3Var6 = y0.f40132d;
                p3.r(d0.APP_EVENTS, ve.k.a(), "App index sent to FB!");
                break;
        }
    }
}
