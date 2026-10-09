package cf;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6928a;

    public /* synthetic */ l(int i11) {
        this.f6928a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0221  */
    /* JADX WARN: Code duplicated, block: B:59:0x0227  */
    /* JADX WARN: Code duplicated, block: B:78:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public o a(Context context) {
        Class cls;
        Object objT;
        o oVar;
        Class clsI = x.i("com.android.billingclient.api.BillingClient");
        Class clsI2 = x.i("com.android.billingclient.api.Purchase");
        Class clsI3 = x.i("com.android.billingclient.api.ProductDetails");
        Class clsI4 = x.i("com.android.billingclient.api.PurchaseHistoryRecord");
        Class clsI5 = x.i("com.android.billingclient.api.QueryProductDetailsParams$Product");
        Class clsI6 = x.i("com.android.billingclient.api.BillingResult");
        Class clsI7 = x.i("com.android.billingclient.api.QueryProductDetailsParams");
        Class clsI8 = x.i("com.android.billingclient.api.QueryPurchaseHistoryParams");
        Class clsI9 = x.i("com.android.billingclient.api.QueryPurchasesParams");
        Class clsI10 = x.i("com.android.billingclient.api.QueryProductDetailsParams$Builder");
        Class clsI11 = x.i("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
        Class clsI12 = x.i("com.android.billingclient.api.QueryPurchasesParams$Builder");
        Class clsI13 = x.i("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
        Class clsI14 = x.i("com.android.billingclient.api.BillingClient$Builder");
        Class clsI15 = x.i("com.android.billingclient.api.PurchasesUpdatedListener");
        Class clsI16 = x.i("com.android.billingclient.api.BillingClientStateListener");
        Class clsI17 = x.i("com.android.billingclient.api.ProductDetailsResponseListener");
        Class clsI18 = x.i("com.android.billingclient.api.PurchasesResponseListener");
        Class clsI19 = x.i("com.android.billingclient.api.PurchaseHistoryResponseListener");
        if (clsI == null || clsI2 == null || clsI3 == null || clsI4 == null || clsI5 == null || clsI6 == null || clsI7 == null || clsI8 == null || clsI9 == null || clsI10 == null || clsI11 == null || clsI12 == null || clsI13 == null || clsI14 == null || clsI15 == null || clsI16 == null || clsI17 == null || clsI18 == null || clsI19 == null) {
            qf.a.b(o.class);
            return null;
        }
        Method methodP = x.p(clsI, "queryPurchasesAsync", clsI9, clsI18);
        Method methodP2 = x.p(clsI9, "newBuilder", new Class[0]);
        Method methodP3 = x.p(clsI12, "build", new Class[0]);
        Method methodP4 = x.p(clsI12, "setProductType", String.class);
        Method methodP5 = x.p(clsI2, "getOriginalJson", new Class[0]);
        Method methodP6 = x.p(clsI, "queryPurchaseHistoryAsync", clsI8, clsI19);
        Method methodP7 = x.p(clsI8, "newBuilder", new Class[0]);
        Method methodP8 = x.p(clsI11, "build", new Class[0]);
        Method methodP9 = x.p(clsI11, "setProductType", String.class);
        Method methodP10 = x.p(clsI4, "getOriginalJson", new Class[0]);
        Method methodP11 = x.p(clsI, "queryProductDetailsAsync", clsI7, clsI17);
        Method methodP12 = x.p(clsI7, "newBuilder", new Class[0]);
        Method methodP13 = x.p(clsI10, "build", new Class[0]);
        Method methodP14 = x.p(clsI10, "setProductList", List.class);
        Method methodP15 = x.p(clsI5, "newBuilder", new Class[0]);
        Method methodP16 = x.p(clsI13, "build", new Class[0]);
        Method methodP17 = x.p(clsI13, "setProductId", String.class);
        Method methodP18 = x.p(clsI13, "setProductType", String.class);
        Method methodP19 = x.p(clsI3, "toString", new Class[0]);
        Method methodP20 = x.p(clsI, "startConnection", clsI16);
        Method methodP21 = x.p(clsI6, "getResponseCode", new Class[0]);
        if (methodP == null || methodP2 == null || methodP3 == null || methodP4 == null || methodP5 == null || methodP6 == null || methodP7 == null || methodP8 == null || methodP9 == null || methodP10 == null || methodP11 == null || methodP12 == null || methodP13 == null || methodP14 == null || methodP15 == null || methodP16 == null || methodP17 == null || methodP18 == null || methodP19 == null || methodP20 == null || methodP21 == null) {
            qf.a.b(o.class);
            return null;
        }
        Method methodP22 = x.p(clsI, "newBuilder", Context.class);
        Method methodP23 = x.p(clsI14, "setListener", clsI15);
        Method methodP24 = x.p(clsI14, "enablePendingPurchases", new Class[0]);
        Method methodP25 = x.p(clsI14, "build", new Class[0]);
        if (methodP25 != null && methodP23 != null && methodP22 != null && methodP24 != null) {
            cls = clsI;
            Object objT2 = x.t(clsI14, x.t(clsI, null, methodP22, context), methodP23, Proxy.newProxyInstance(clsI15.getClassLoader(), new Class[]{clsI15}, this));
            if (objT2 != null) {
                objT = x.t(clsI14, x.t(clsI14, objT2, methodP24, new Object[0]), methodP25, new Object[0]);
            }
            if (objT == null) {
                qf.a.b(o.class);
                return null;
            }
            oVar = new o(objT, cls, clsI2, clsI3, clsI4, clsI5, clsI6, clsI7, clsI8, clsI10, clsI11, clsI13, clsI16, clsI17, clsI19, methodP5, methodP6, methodP7, methodP8, methodP9, methodP10, methodP11, methodP12, methodP13, methodP14, methodP15, methodP16, methodP17, methodP18, methodP19, methodP20, methodP21);
            if (!qf.a.b(o.class)) {
                try {
                    o.I = oVar;
                } catch (Throwable th2) {
                    qf.a.a(o.class, th2);
                }
            }
            if (!qf.a.b(o.class)) {
                try {
                    return o.I;
                } catch (Throwable th3) {
                    qf.a.a(o.class, th3);
                }
            }
            return null;
        }
        cls = clsI;
        objT = null;
        if (objT == null) {
            qf.a.b(o.class);
            return null;
        }
        oVar = new o(objT, cls, clsI2, clsI3, clsI4, clsI5, clsI6, clsI7, clsI8, clsI10, clsI11, clsI13, clsI16, clsI17, clsI19, methodP5, methodP6, methodP7, methodP8, methodP9, methodP10, methodP11, methodP12, methodP13, methodP14, methodP15, methodP16, methodP17, methodP18, methodP19, methodP20, methodP21);
        if (!qf.a.b(o.class)) {
            o.I = oVar;
        }
        if (!qf.a.b(o.class)) {
            return o.I;
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m, Object[] objArr) {
        switch (this.f6928a) {
            case 0:
                if (!qf.a.b(this)) {
                    try {
                        kotlin.jvm.internal.m.f(proxy, "proxy");
                        kotlin.jvm.internal.m.f(m, "m");
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                        return null;
                    }
                    break;
                }
                break;
            default:
                kotlin.jvm.internal.m.f(proxy, "proxy");
                kotlin.jvm.internal.m.f(m, "m");
                break;
        }
        return null;
    }
}
