package h2;

import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import com.google.api.Service;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.lingodeer.R;
import fr.p3;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import lf.a0;
import lf.j0;
import lf.j1;
import lf.v0;
import lf.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.i0;
import re.v;
import re.y;
import re.z;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements j, ComponentFactory, u, l1.h, l8.g, lf.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31459a;

    public /* synthetic */ d(int i11) {
        this.f31459a = i11;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    @Override // h2.j
    public double a(double d5) {
        switch (this.f31459a) {
            case 0:
                double d11 = d5 < 0.0d ? -d5 : d5;
                return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d5);
            case 1:
                float[] fArr = e.f31460a;
                return e.b(e.f31462c, d5);
            case 2:
                float[] fArr2 = e.f31460a;
                return e.a(e.f31462c, d5);
            case 3:
                float[] fArr3 = e.f31460a;
                return e.d(e.f31463d, d5);
            case 4:
                float[] fArr4 = e.f31460a;
                return e.c(e.f31463d, d5);
            default:
                return d5;
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        switch (this.f31459a) {
            case 7:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            default:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
        }
    }

    @Override // z4.u
    public v1 e(View v11, v1 v1Var) {
        switch (this.f31459a) {
            case 10:
                kotlin.jvm.internal.m.f(v11, "v");
                r4.d dVarG = v1Var.f58905a.g(519);
                kotlin.jvm.internal.m.e(dVarG, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dVarG.f48794b;
                v11.setLayoutParams(marginLayoutParams);
                return v1Var;
            case 11:
                kotlin.jvm.internal.m.f(v11, "v");
                r4.d dVarG2 = v1Var.f58905a.g(519);
                kotlin.jvm.internal.m.e(dVarG2, "getInsets(...)");
                ViewGroup.LayoutParams layoutParams2 = v11.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = 0;
                v11.setLayoutParams(marginLayoutParams2);
                v11.setPadding(0, 0, 0, dVarG2.f48796d);
                return v1Var;
            default:
                kotlin.jvm.internal.m.f(v11, "v");
                r4.d dVarG3 = v1Var.f58905a.g(519);
                kotlin.jvm.internal.m.e(dVarG3, "getInsets(...)");
                int i11 = dVarG3.f48794b;
                dVarG3.toString();
                if (v11.getTag(R.id.tag_origin_padding_top) == null) {
                    v11.setTag(R.id.tag_origin_padding_top, Integer.valueOf(v11.getPaddingTop()));
                }
                if (v11.getTag(R.id.tag_origin_height) == null) {
                    v11.setTag(R.id.tag_origin_height, Integer.valueOf(v11.getHeight()));
                }
                if (v11.getLayoutParams().height != -2) {
                    ViewGroup.LayoutParams layoutParams3 = v11.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    Object tag = v11.getTag(R.id.tag_origin_height);
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams3.height = ((Integer) tag).intValue() + i11;
                    v11.setLayoutParams(layoutParams3);
                }
                Object tag2 = v11.getTag(R.id.tag_origin_padding_top);
                kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.Int");
                v11.setPadding(v11.getPaddingLeft(), ((Integer) tag2).intValue() + i11, v11.getPaddingRight(), v11.getPaddingBottom());
                return v1Var;
        }
    }

    @Override // l8.g
    public boolean f(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    @Override // lf.u
    public void h(boolean z11) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        int i11 = 0;
        switch (this.f31459a) {
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (z11) {
                    synchronized (pf.a.f46833b) {
                        try {
                            re.s sVar = re.s.f49201a;
                            if (i0.c()) {
                                p3.w();
                            }
                            if (pf.a.f46834c == null) {
                                pf.a aVar = new pf.a(Thread.getDefaultUncaughtExceptionHandler());
                                pf.a.f46834c = aVar;
                                Thread.setDefaultUncaughtExceptionHandler(aVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (a0.b(x.CrashShield)) {
                        ns.o.f44008b = true;
                        if (i0.c() && !j1.w()) {
                            File fileQ = ob.f.q();
                            if (fileQ == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileQ.listFiles(new j0(7));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                nf.e eVarA = o00.a.A(file);
                                if (eVarA.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", eVarA.toString());
                                        String str = y.f49225j;
                                        arrayList.add(v.C(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{re.s.b()}, 1)), jSONObject, new nf.a(eVarA, i11)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                re.a0 a0Var = new re.a0(arrayList);
                                String str2 = y.f49225j;
                                v0.j(a0Var);
                                new z(a0Var).executeOnExecutor(re.s.d(), new Void[0]);
                            }
                        }
                        qf.a.f47725b = true;
                    }
                    a0.b(x.ThreadCheck);
                    return;
                }
                return;
            default:
                if (z11) {
                    re.s sVar2 = re.s.f49201a;
                    if (!i0.c() || j1.w()) {
                        return;
                    }
                    File fileQ2 = ob.f.q();
                    if (fileQ2 == null) {
                        fileArrListFiles2 = new File[0];
                    } else {
                        fileArrListFiles2 = fileQ2.listFiles(new j0(8));
                        kotlin.jvm.internal.m.e(fileArrListFiles2, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        kotlin.jvm.internal.m.f(file2, "file");
                        rf.a aVar2 = new rf.a();
                        String name = file2.getName();
                        kotlin.jvm.internal.m.e(name, "file.name");
                        aVar2.f49239a = name;
                        JSONObject jSONObjectH = ob.f.H(name);
                        if (jSONObjectH != null) {
                            aVar2.f49241c = Long.valueOf(jSONObjectH.optLong("timestamp", 0L));
                            aVar2.f49240b = jSONObjectH.optString("error_message", null);
                        }
                        if (aVar2.f49240b != null && aVar2.f49241c != null) {
                            arrayList2.add(aVar2);
                        }
                    }
                    ry.p.Z(arrayList2, new bq.h(16));
                    JSONArray jSONArray = new JSONArray();
                    while (i11 < arrayList2.size() && i11 < 1000) {
                        jSONArray.put(arrayList2.get(i11));
                        i11++;
                    }
                    ob.f.J("error_reports", jSONArray, new nf.a(arrayList2, 3));
                    return;
                }
                return;
        }
    }

    @Override // l1.h
    public void cancel() {
    }
}
