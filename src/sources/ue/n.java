package ue;

import fr.p3;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import lf.j1;
import lf.y0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qy.b0;
import re.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f52934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f52935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f52936c;

    static {
        d dVar = d.ANON_ID;
        t tVar = t.USER_DATA;
        qy.l lVar = new qy.l(dVar, new j(tVar, u.ANON_ID));
        qy.l lVar2 = new qy.l(d.APP_USER_ID, new j(tVar, u.FB_LOGIN_ID));
        qy.l lVar3 = new qy.l(d.ADVERTISER_ID, new j(tVar, u.MAD_ID));
        qy.l lVar4 = new qy.l(d.PAGE_ID, new j(tVar, u.PAGE_ID));
        qy.l lVar5 = new qy.l(d.PAGE_SCOPED_USER_ID, new j(tVar, u.PAGE_SCOPED_USER_ID));
        d dVar2 = d.ADV_TE;
        t tVar2 = t.APP_DATA;
        f52934a = ry.x.Y(lVar, lVar2, lVar3, lVar4, lVar5, new qy.l(dVar2, new j(tVar2, u.ADV_TE)), new qy.l(d.APP_TE, new j(tVar2, u.APP_TE)), new qy.l(d.CONSIDER_VIEWS, new j(tVar2, u.CONSIDER_VIEWS)), new qy.l(d.DEVICE_TOKEN, new j(tVar2, u.DEVICE_TOKEN)), new qy.l(d.EXT_INFO, new j(tVar2, u.EXT_INFO)), new qy.l(d.INCLUDE_DWELL_DATA, new j(tVar2, u.INCLUDE_DWELL_DATA)), new qy.l(d.INCLUDE_VIDEO_DATA, new j(tVar2, u.INCLUDE_VIDEO_DATA)), new qy.l(d.INSTALL_REFERRER, new j(tVar2, u.INSTALL_REFERRER)), new qy.l(d.INSTALLER_PACKAGE, new j(tVar2, u.INSTALLER_PACKAGE)), new qy.l(d.RECEIPT_DATA, new j(tVar2, u.RECEIPT_DATA)), new qy.l(d.URL_SCHEMES, new j(tVar2, u.URL_SCHEMES)), new qy.l(d.USER_DATA, new j(tVar, null)));
        qy.l lVar6 = new qy.l(w.EVENT_TIME, new i(null, r.EVENT_TIME));
        qy.l lVar7 = new qy.l(w.EVENT_NAME, new i(null, r.EVENT_NAME));
        w wVar = w.VALUE_TO_SUM;
        t tVar3 = t.CUSTOM_DATA;
        f52935b = ry.x.Y(lVar6, lVar7, new qy.l(wVar, new i(tVar3, r.VALUE_TO_SUM)), new qy.l(w.CONTENT_IDS, new i(tVar3, r.CONTENT_IDS)), new qy.l(w.CONTENTS, new i(tVar3, r.CONTENTS)), new qy.l(w.CONTENT_TYPE, new i(tVar3, r.CONTENT_TYPE)), new qy.l(w.CURRENCY, new i(tVar3, r.CURRENCY)), new qy.l(w.DESCRIPTION, new i(tVar3, r.DESCRIPTION)), new qy.l(w.LEVEL, new i(tVar3, r.LEVEL)), new qy.l(w.MAX_RATING_VALUE, new i(tVar3, r.MAX_RATING_VALUE)), new qy.l(w.NUM_ITEMS, new i(tVar3, r.NUM_ITEMS)), new qy.l(w.PAYMENT_INFO_AVAILABLE, new i(tVar3, r.PAYMENT_INFO_AVAILABLE)), new qy.l(w.REGISTRATION_METHOD, new i(tVar3, r.REGISTRATION_METHOD)), new qy.l(w.SEARCH_STRING, new i(tVar3, r.SEARCH_STRING)), new qy.l(w.SUCCESS, new i(tVar3, r.SUCCESS)), new qy.l(w.ORDER_ID, new i(tVar3, r.ORDER_ID)), new qy.l(w.AD_TYPE, new i(tVar3, r.AD_TYPE)));
        f52936c = ry.x.Y(new qy.l("fb_mobile_achievement_unlocked", s.UNLOCKED_ACHIEVEMENT), new qy.l("fb_mobile_activate_app", s.ACTIVATED_APP), new qy.l("fb_mobile_add_payment_info", s.ADDED_PAYMENT_INFO), new qy.l("fb_mobile_add_to_cart", s.ADDED_TO_CART), new qy.l("fb_mobile_add_to_wishlist", s.ADDED_TO_WISHLIST), new qy.l("fb_mobile_complete_registration", s.COMPLETED_REGISTRATION), new qy.l("fb_mobile_content_view", s.VIEWED_CONTENT), new qy.l("fb_mobile_initiated_checkout", s.INITIATED_CHECKOUT), new qy.l("fb_mobile_level_achieved", s.ACHIEVED_LEVEL), new qy.l("fb_mobile_purchase", s.PURCHASED), new qy.l("fb_mobile_rate", s.RATED), new qy.l("fb_mobile_search", s.SEARCHED), new qy.l("fb_mobile_spent_credits", s.SPENT_CREDITS), new qy.l("fb_mobile_tutorial_completion", s.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        l lVar;
        l.Companion.getClass();
        if (str.equals(d.EXT_INFO.a()) || str.equals(d.URL_SCHEMES.a()) || str.equals(w.CONTENT_IDS.a()) || str.equals(w.CONTENTS.a()) || str.equals(h.OPTIONS.a())) {
            lVar = l.ARRAY;
        } else if (str.equals(d.ADV_TE.a()) || str.equals(d.APP_TE.a())) {
            lVar = l.BOOL;
        } else {
            lVar = str.equals(w.EVENT_TIME.a()) ? l.INT : null;
        }
        String str2 = obj instanceof String ? (String) obj : null;
        if (lVar == null || str2 == null) {
            return obj;
        }
        int i11 = m.f52931a[lVar.ordinal()];
        int i12 = 0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return oz.x.t0(obj.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer numT0 = oz.x.t0(str2.toString());
            if (numT0 != null) {
                return Boolean.valueOf(numT0.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList arrayListG = j1.g(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            int size = arrayListG.size();
            while (i12 < size) {
                Object obj2 = arrayListG.get(i12);
                i12++;
                ?? G = (String) obj2;
                try {
                    try {
                        G = j1.h(new JSONObject((String) G));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    G = j1.g(new JSONArray((String) G));
                }
                arrayList.add(G);
            }
            return arrayList;
        } catch (JSONException e8) {
            p3 p3Var = y0.f40132d;
            p3.s(d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e8);
            return b0.f48488a;
        }
    }
}
