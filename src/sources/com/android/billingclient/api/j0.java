package com.android.billingclient.api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f7522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f7523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f7525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f7526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f7527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f7528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f7529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f7530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j f7531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f7532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f7533l;
    public static final j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f7535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f7536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f7537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f7538r;

    static {
        i iVarA = j.a();
        iVarA.f7515a = 3;
        iVarA.f7517c = "Google Play In-app Billing API version is less than 3";
        iVarA.a();
        i iVarA2 = j.a();
        iVarA2.f7515a = 3;
        iVarA2.f7517c = "Google Play In-app Billing API version is less than 9";
        f7522a = iVarA2.a();
        i iVarA3 = j.a();
        iVarA3.f7515a = 3;
        iVarA3.f7517c = "Billing service unavailable on device.";
        f7523b = iVarA3.a();
        i iVarA4 = j.a();
        iVarA4.f7515a = 2;
        iVarA4.f7517c = "Billing service unavailable on device.";
        f7524c = iVarA4.a();
        i iVarA5 = j.a();
        iVarA5.f7515a = 5;
        iVarA5.f7517c = "Client is already in the process of connecting to billing service.";
        f7525d = iVarA5.a();
        i iVarA6 = j.a();
        iVarA6.f7515a = 5;
        iVarA6.f7517c = "The list of SKUs can't be empty.";
        iVarA6.a();
        i iVarA7 = j.a();
        iVarA7.f7515a = 5;
        iVarA7.f7517c = "SKU type can't be empty.";
        iVarA7.a();
        i iVarA8 = j.a();
        iVarA8.f7515a = 5;
        iVarA8.f7517c = "Product type can't be empty.";
        f7526e = iVarA8.a();
        i iVarA9 = j.a();
        iVarA9.f7515a = -2;
        iVarA9.f7517c = "Client does not support extra params.";
        f7527f = iVarA9.a();
        i iVarA10 = j.a();
        iVarA10.f7515a = 5;
        iVarA10.f7517c = "Invalid purchase token.";
        f7528g = iVarA10.a();
        i iVarA11 = j.a();
        iVarA11.f7515a = 6;
        iVarA11.f7517c = "An internal error occurred.";
        f7529h = iVarA11.a();
        i iVarA12 = j.a();
        iVarA12.f7515a = 5;
        iVarA12.f7517c = "SKU can't be null.";
        iVarA12.a();
        i iVarA13 = j.a();
        iVarA13.f7515a = 0;
        f7530i = iVarA13.a();
        i iVarA14 = j.a();
        iVarA14.f7515a = -1;
        iVarA14.f7517c = "Service connection is disconnected.";
        f7531j = iVarA14.a();
        i iVarA15 = j.a();
        iVarA15.f7515a = 2;
        iVarA15.f7517c = "Timeout communicating with service.";
        f7532k = iVarA15.a();
        i iVarA16 = j.a();
        iVarA16.f7515a = -2;
        iVarA16.f7517c = "Client does not support subscriptions.";
        f7533l = iVarA16.a();
        i iVarA17 = j.a();
        iVarA17.f7515a = -2;
        iVarA17.f7517c = "Client does not support subscriptions update.";
        iVarA17.a();
        i iVarA18 = j.a();
        iVarA18.f7515a = -2;
        iVarA18.f7517c = "Client does not support get purchase history.";
        iVarA18.a();
        i iVarA19 = j.a();
        iVarA19.f7515a = -2;
        iVarA19.f7517c = "Client does not support price change confirmation.";
        iVarA19.a();
        i iVarA20 = j.a();
        iVarA20.f7515a = -2;
        iVarA20.f7517c = "Play Store version installed does not support cross selling products.";
        iVarA20.a();
        i iVarA21 = j.a();
        iVarA21.f7515a = -2;
        iVarA21.f7517c = "Client does not support multi-item purchases.";
        m = iVarA21.a();
        i iVarA22 = j.a();
        iVarA22.f7515a = -2;
        iVarA22.f7517c = "Client does not support offer_id_token.";
        f7534n = iVarA22.a();
        i iVarA23 = j.a();
        iVarA23.f7515a = -2;
        iVarA23.f7517c = "Client does not support ProductDetails.";
        f7535o = iVarA23.a();
        i iVarA24 = j.a();
        iVarA24.f7515a = -2;
        iVarA24.f7517c = "Client does not support in-app messages.";
        iVarA24.a();
        i iVarA25 = j.a();
        iVarA25.f7515a = -2;
        iVarA25.f7517c = "Client does not support user choice billing.";
        iVarA25.a();
        i iVarA26 = j.a();
        iVarA26.f7515a = -2;
        iVarA26.f7517c = "Play Store version installed does not support external offer.";
        iVarA26.a();
        i iVarA27 = j.a();
        iVarA27.f7515a = -2;
        iVarA27.f7517c = "Play Store version installed does not support multi-item purchases with season pass in one cart.";
        iVarA27.a();
        i iVarA28 = j.a();
        iVarA28.f7515a = -2;
        iVarA28.f7517c = "Play Store version installed does not support querying AutoPay plan purchase.";
        iVarA28.a();
        i iVarA29 = j.a();
        iVarA29.f7515a = -2;
        iVarA29.f7517c = "Play Store version installed does not support including suspended subscriptions.";
        iVarA29.a();
        i iVarA30 = j.a();
        iVarA30.f7515a = 5;
        iVarA30.f7517c = "Unknown feature";
        iVarA30.a();
        i iVarA31 = j.a();
        iVarA31.f7515a = -2;
        iVarA31.f7517c = "Play Store version installed does not support get billing config.";
        iVarA31.a();
        i iVarA32 = j.a();
        iVarA32.f7515a = -2;
        iVarA32.f7517c = "Query product details with serialized docid is not supported.";
        iVarA32.a();
        i iVarA33 = j.a();
        iVarA33.f7515a = -2;
        iVarA33.f7517c = "Play Store version installed does not support launching external offer flow.";
        iVarA33.a();
        i iVarA34 = j.a();
        iVarA34.f7515a = 4;
        iVarA34.f7517c = "Item is unavailable for purchase.";
        f7536p = iVarA34.a();
        i iVarA35 = j.a();
        iVarA35.f7515a = -2;
        iVarA35.f7517c = "Query product details with developer specified account is not supported.";
        iVarA35.a();
        i iVarA36 = j.a();
        iVarA36.f7515a = -2;
        iVarA36.f7517c = "Play Store version installed does not support alternative billing only.";
        iVarA36.a();
        i iVarA37 = j.a();
        iVarA37.f7515a = 5;
        iVarA37.f7517c = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f7537q = iVarA37.a();
        i iVarA38 = j.a();
        iVarA38.f7515a = 6;
        iVarA38.f7517c = "An error occurred while retrieving billing override.";
        f7538r = iVarA38.a();
        i iVarA39 = j.a();
        iVarA39.f7515a = -2;
        iVarA39.f7517c = "Play Store version installed does not support the provided billing program.";
        iVarA39.a();
    }

    public static j a(int i11, String str) {
        i iVarA = j.a();
        iVarA.f7515a = i11;
        iVarA.f7517c = str;
        return iVarA.a();
    }
}
