package dv;

import android.content.Context;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.BillingStatus;
import com.lingodeer.data.model.LearnTimeCollectionItem;
import com.lingodeer.data.model.ProgressCollectionItem;
import com.lingodeer.data.model.StreakCollectionItem;
import com.lingodeer.data.model.SubCourseProgressCollectionItem;
import com.lingodeer.data.model.XPCollectionItem;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.ApiResponseKt;
import com.lingodeer.network.model.BooleanResponse;
import com.lingodeer.network.model.GemAppendBySomeReasonResponse;
import com.lingodeer.network.model.LeaderBoardResponse;
import com.lingodeer.network.model.MeDataFriendsUpdateResponse;
import com.lingodeer.network.model.MeUserDataResponse;
import com.lingodeer.network.model.ProgressGetSRSRecordResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import com.lingodeer.network.model.ServerReviewDataResponse;
import com.lingodeer.network.model.SubCourseProgressUpdateResponse;
import com.lingodeer.network.model.SubscriptionResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.z3;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f24522a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24525d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qy.q f24523b = com.bumptech.glide.d.v(new cr.n(this, 12));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f24524c = (g) x0.f24532b.b(g.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24526e = "client_meta_data";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24527f = "client_datetime";

    public u0(Context context, vt.n0 n0Var) {
        this.f24522a = n0Var;
        this.f24525d = "Android-".concat(ks.b.c(context));
    }

    public static JsonObject b() {
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.ROOT);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        String id2 = timeZone.getID();
        int rawOffset = timeZone.getRawOffset() / 60000;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("local_time", str);
        jsonObject.addProperty("timezone_id", id2);
        jsonObject.addProperty("utc_offset_minutes", Integer.valueOf(rawOffset));
        return jsonObject;
    }

    public static Object h(u0 u0Var, String str, String str2, String str3, String str4, String str5, int i11, String str6, xy.i iVar, int i12) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        if ((i12 & 2) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        if ((i12 & 4) != 0) {
            str3 = BuildConfig.VERSION_NAME;
        }
        String str7 = (i12 & 16) != 0 ? BuildConfig.VERSION_NAME : str4;
        String str8 = (i12 & 32) != 0 ? BuildConfig.VERSION_NAME : str5;
        int i13 = (i12 & 512) != 0 ? -1 : i11;
        String str9 = (i12 & 1024) != 0 ? BuildConfig.VERSION_NAME : str6;
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add(u0Var.f24526e, u0Var.c());
        jsonObjectC.addProperty("user_nickname", str2);
        jsonObjectC.addProperty("user_image", str3);
        jsonObjectC.addProperty("new_feed_read_ids", BuildConfig.VERSION_NAME);
        jsonObjectC.addProperty("setting_learning_lan", str7);
        jsonObjectC.addProperty("setting_uilan", str8);
        jsonObjectC.addProperty("setting_reminders", BuildConfig.VERSION_NAME);
        jsonObjectC.addProperty("append_billingpageview_num", new Integer(0));
        jsonObjectC.addProperty("setting_soundeffect", new Integer(-1));
        jsonObjectC.addProperty("setting_show_leaderboard", new Integer(i13));
        jsonObjectC.addProperty("m_msgtoken_android", str9);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", u0Var.a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAppSettingSet$2
        }, new BooleanResponse(false, 1, null), new g0(u0Var, (JsonObject) lVarY.f48495a, null, 12), iVar);
    }

    public final Object A(String str, long j11, ArrayList arrayList, List list, List list2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.addProperty("last_sync_timestamp", new Long(j11));
        jsonObjectC.add("m_items", new Gson().toJsonTree(arrayList).getAsJsonArray());
        jsonObjectC.add("data_lan_list", new Gson().toJsonTree(list));
        jsonObjectC.add("data_type_list", new Gson().toJsonTree(list2));
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(this, jsonObjectC, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        SecretKey secretKey = (SecretKey) lVar.f48495a;
        SecretKey secretKey2 = (SecretKey) lVar.f48496b;
        JsonObject jsonObject = (JsonObject) lVarY.f48495a;
        File file = new File(defpackage.e.m(((fr.o0) this.f24522a).v(), "user_items_review_data_sync_postContent.txt"));
        String string = jsonObject.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        cz.k.V(file, string);
        return v(secretKey, secretKey2, new TypeToken<ServerJsonResponse<ServerReviewDataResponse>>() { // from class: com.lingodeer.network.NetworkClient$userItemsReviewDataSync$2
        }, null, new p0(this, jsonObject, null, 16), cVar);
    }

    public final Object C(String str, String str2, String str3, z3 z3Var) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uid", str);
        jsonObject.addProperty("nickname", str2);
        jsonObject.addProperty("email", str3);
        qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$userProfileRemove$2
        }, new BooleanResponse(false, 1, null), new p0(this, (JsonObject) lVarY.f48495a, null, 21), z3Var);
    }

    public final Object D(long j11, int i11, int i12, boolean z11, String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("AndroidOrIOS", "Android");
        jsonObjectC.addProperty("appversion", oz.x.q0(this.f24525d, "Android-", BuildConfig.VERSION_NAME));
        Env env = ((fr.o0) this.f24522a).f27733a;
        jsonObjectC.addProperty("LessonLanguage", xt.d.f(env.keyLanguage) + ":" + (xt.d.y(env.keyLanguage) ? "lv_1" : "lv_2"));
        jsonObjectC.addProperty("CWSId", new Long(j11));
        jsonObjectC.addProperty("CWSType", new Integer(i11));
        jsonObjectC.addProperty("CWSModelType", new Integer(i12));
        jsonObjectC.addProperty("AcceptMyAnswer", Boolean.valueOf(z11));
        jsonObjectC.addProperty("SSImageName", str);
        jsonObjectC.addProperty("UFeedback", str2);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$userReport$2
        }, new BooleanResponse(false, 1, null), new p0(this, (JsonObject) lVarY.f48495a, null, 22), cVar);
    }

    public final hv.a a() {
        return (hv.a) this.f24523b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(String str, String str2, String str3, String str4, String str5, String str6, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i11 = i0Var.f24462c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i0Var.f24462c = i11 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        i0 i0Var2 = i0Var;
        Object objV = i0Var2.f24460a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = i0Var2.f24462c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("package_Name", str2);
            jsonObject.addProperty("product_Id", str3);
            jsonObject.addProperty("purchase_Token", str4);
            jsonObject.addProperty("priceAmountMicros", str5);
            jsonObject.addProperty("priceCurrencyCode", str6);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<SubscriptionResponse>>() { // from class: com.lingodeer.network.NetworkClient$gpPurchaseRestore$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 4);
            i0Var2.f24462c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, i0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return v0.a(apiResponse);
        }
        BillingStatus billingStatus = ApiResponseKt.toBillingStatus(((SubscriptionResponse) ((ApiResponse.Success) apiResponse).getData()).getM_membership());
        return billingStatus.getProductId().length() > 0 ? new ApiResponse.Success(billingStatus) : new ApiResponse.Error(BuildConfig.VERSION_NAME, 0, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(String str, String str2, String str3, String str4, String str5, String str6, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i11 = j0Var.f24471c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j0Var.f24471c = i11 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        j0 j0Var2 = j0Var;
        Object objV = j0Var2.f24469a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = j0Var2.f24471c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("package_Name", str2);
            jsonObject.addProperty("product_Id", str3);
            jsonObject.addProperty("purchase_Token", str4);
            jsonObject.addProperty("priceAmountMicros", str5);
            jsonObject.addProperty("priceCurrencyCode", str6);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<SubscriptionResponse>>() { // from class: com.lingodeer.network.NetworkClient$gpPurchaseSubscription$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 5);
            j0Var2.f24471c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, j0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return v0.a(apiResponse);
        }
        BillingStatus billingStatus = ApiResponseKt.toBillingStatus(((SubscriptionResponse) ((ApiResponse.Success) apiResponse).getData()).getM_membership());
        return billingStatus.getProductId().length() > 0 ? new ApiResponse.Success(billingStatus) : new ApiResponse.Error(BuildConfig.VERSION_NAME, 0, null, 6, null);
    }

    public final Object g(String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add(this.f24526e, c());
        jsonObjectC.addProperty("achiev_languages", str2);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAchievementLanguagesSet$2
        }, new BooleanResponse(false, 1, null), new g0(this, (JsonObject) lVarY.f48495a, null, 6), cVar);
    }

    public final Object i(String str, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add(this.f24526e, c());
        jsonObjectC.add(this.f24527f, b());
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<MeUserDataResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataFriendProfileGet$2
        }, null, new g0(this, (JsonObject) lVarY.f48495a, null, 15), iVar);
    }

    public final Object j(String str, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uid", str);
        jsonObject.addProperty("reason", "1");
        jsonObject.addProperty("description", BuildConfig.VERSION_NAME);
        qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<GemAppendBySomeReasonResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataGemsAppendBySomeReason$2
        }, null, new g0(this, (JsonObject) lVarY.f48495a, null, 16), iVar);
    }

    public final Object k(String str, List list, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add("study_data_lans", new Gson().toJsonTree(list));
        jsonObjectC.add(this.f24526e, c());
        jsonObjectC.add(this.f24527f, b());
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<MeUserDataResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataGet$2
        }, null, new g0(this, (JsonObject) lVarY.f48495a, null, 17), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.f24479c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f24479c = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        k0 k0Var2 = k0Var;
        Object objV = k0Var2.f24477a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = k0Var2.f24479c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("append_time_str", str2);
            jsonObject.add(this.f24526e, c());
            jsonObject.add(this.f24527f, b());
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataLearnTimeAppend$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 18);
            k0Var2.f24479c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, k0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (apiResponse instanceof ApiResponse.Success) {
            return new ApiResponse.Success(new Long(((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("total_time").getAsLong()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object m(String str, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        l0 l0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i11 = l0Var.f24485c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                l0Var.f24485c = i11 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        l0 l0Var2 = l0Var;
        Object objV = l0Var2.f24483a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = l0Var2.f24485c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataLearnTimeGetAllCollection$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 19);
            l0Var2.f24485c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, l0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonObject asJsonObject = ((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("all_time_collection").getAsJsonObject();
        Set<String> setKeySet = asJsonObject.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(ry.n.W(set, 10));
        for (String str2 : set) {
            kotlin.jvm.internal.m.c(str2);
            arrayList.add(new LearnTimeCollectionItem(str2, asJsonObject.get(str2).getAsJsonObject().get("seconds").getAsInt(), asJsonObject.get(str2).getAsJsonObject().get("bstime").getAsInt()));
        }
        return new ApiResponse.Success(arrayList);
    }

    public final Object n(String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add(this.f24526e, c());
        jsonObjectC.addProperty("user_mastery", str2);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataMasterySet$2
        }, new BooleanResponse(false, 1, null), new g0(this, (JsonObject) lVarY.f48495a, null, 20), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8, types: [qy.n] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [dv.u0] */
    public final Object o(String str, String str2, xy.c cVar) {
        m0 m0Var;
        ?? L;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i11 = m0Var.f24488c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m0Var.f24488c = i11 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        m0 m0Var2 = m0Var;
        Object objV = m0Var2.f24486a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = m0Var2.f24488c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("append_streak_str", str2);
            jsonObject.add(this.f24526e, c());
            jsonObject.add(this.f24527f, b());
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken<ServerJsonResponse<JsonObject>> typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataStreakAppend$2
            };
            g0 g0Var = new g0(this, jsonObject2, null, 22);
            m0Var2.f24488c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, m0Var2);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            JsonObject asJsonObject = ((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("recent_streak_collection").getAsJsonObject();
            Set<String> setKeySet = asJsonObject.keySet();
            kotlin.jvm.internal.m.e(setKeySet, "keySet(...)");
            Set<String> set = setKeySet;
            L = new ArrayList(ry.n.W(set, 10));
            for (String str3 : set) {
                kotlin.jvm.internal.m.c(str3);
                String asString = asJsonObject.get(str3).getAsJsonObject().get("type").getAsString();
                kotlin.jvm.internal.m.e(asString, "getAsString(...)");
                L.add(new StreakCollectionItem(str3, asString));
            }
        } catch (Throwable th2) {
            L = com.bumptech.glide.e.l(th2);
        }
        return new ApiResponse.Success(qy.o.a(L) == null ? (List) L : ry.r.f50854a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object p(String str, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i11 = n0Var.f24492c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n0Var.f24492c = i11 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        n0 n0Var2 = n0Var;
        Object objV = n0Var2.f24490a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = n0Var2.f24492c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.add(this.f24526e, c());
            jsonObject.add(this.f24527f, b());
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataStreakGetAllCollection$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 25);
            n0Var2.f24492c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, n0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonObject asJsonObject = ((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("all_streak_collection").getAsJsonObject();
        Set<String> setKeySet = asJsonObject.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(ry.n.W(set, 10));
        for (String str2 : set) {
            kotlin.jvm.internal.m.c(str2);
            String asString = asJsonObject.get(str2).getAsJsonObject().get("type").getAsString();
            kotlin.jvm.internal.m.e(asString, "getAsString(...)");
            arrayList.add(new StreakCollectionItem(str2, asString));
        }
        return new ApiResponse.Success(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(String str, List list, List list2, List list3, List list4, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i11 = o0Var.f24496c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o0Var.f24496c = i11 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        o0 o0Var2 = o0Var;
        Object objV = o0Var2.f24494a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = o0Var2.f24496c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.add(this.f24526e, c());
            jsonObject.add("progress_reset_lans", new Gson().toJsonTree(list));
            jsonObject.add("lesson_reset_lans", new Gson().toJsonTree(list2));
            jsonObject.add("unit_reset_lans", new Gson().toJsonTree(list3));
            jsonObject.add("srs_reset_lans", new Gson().toJsonTree(list4));
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataStudyReset$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 26);
            o0Var2.f24496c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, o0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonObject asJsonObject = ((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("all_progress_collection").getAsJsonObject();
        Set<String> setKeySet = asJsonObject.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(ry.n.W(set, 10));
        for (String str2 : set) {
            JsonObject asJsonObject2 = asJsonObject.get(str2).getAsJsonObject();
            JsonElement jsonElement = asJsonObject2.get("restart_timestamp");
            kotlin.jvm.internal.m.c(str2);
            String asString = asJsonObject2.get("main").getAsString();
            kotlin.jvm.internal.m.e(asString, "getAsString(...)");
            String asString2 = asJsonObject2.get("main_tt").getAsString();
            kotlin.jvm.internal.m.e(asString2, "getAsString(...)");
            String asString3 = asJsonObject2.get("lesson_stars").getAsString();
            kotlin.jvm.internal.m.e(asString3, "getAsString(...)");
            String asString4 = asJsonObject2.get("lesson_exam").getAsString();
            kotlin.jvm.internal.m.e(asString4, "getAsString(...)");
            arrayList.add(new ProgressCollectionItem(str2, asString, asString2, asString3, asString4, asJsonObject2.get("pronun").getAsInt(), (jsonElement == null || jsonElement.isJsonNull()) ? 0L : jsonElement.getAsLong()));
        }
        return new ApiResponse.Success(arrayList);
    }

    public final Object r(String str, List list, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add(this.f24526e, c());
        JsonObject jsonObject = new JsonObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubCourseProgressCollectionItem subCourseProgressCollectionItem = (SubCourseProgressCollectionItem) it.next();
            String id2 = subCourseProgressCollectionItem.getId();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("progress", subCourseProgressCollectionItem.getProgress());
            jsonObject2.addProperty("time", new Long(subCourseProgressCollectionItem.getTime()));
            jsonObject.add(id2, jsonObject2);
        }
        jsonObjectC.add("subcourse_progress_collection", jsonObject);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<SubCourseProgressUpdateResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataSubcourseProgressUpdate$2
        }, null, new g0(this, (JsonObject) lVarY.f48495a, null, 28), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object s(String str, String str2, xy.c cVar) {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i11 = q0Var.f24504c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q0Var.f24504c = i11 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        q0 q0Var2 = q0Var;
        Object objV = q0Var2.f24502a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = q0Var2.f24504c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("append_xp_str", str2);
            jsonObject.add(this.f24526e, c());
            jsonObject.add(this.f24527f, b());
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataXPAppend$2
            };
            fz.c p0Var = new p0(this, jsonObject2, null, 1);
            q0Var2.f24504c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, p0Var, q0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (apiResponse instanceof ApiResponse.Success) {
            return new ApiResponse.Success(new Long(((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("total_xp").getAsLong()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object t(String str, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        r0 r0Var;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i11 = r0Var.f24508c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                r0Var.f24508c = i11 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, cVar);
            }
        } else {
            r0Var = new r0(this, cVar);
        }
        r0 r0Var2 = r0Var;
        Object objV = r0Var2.f24506a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = r0Var2.f24508c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<JsonObject>>() { // from class: com.lingodeer.network.NetworkClient$meDataXPGetAllCollection$2
            };
            fz.c p0Var = new p0(this, jsonObject2, null, 2);
            r0Var2.f24508c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, p0Var, r0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (apiResponse instanceof ApiResponse.Error) {
            return apiResponse;
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        JsonObject asJsonObject = ((JsonObject) ((ApiResponse.Success) apiResponse).getData()).get("all_xp_collection").getAsJsonObject();
        Set<String> setKeySet = asJsonObject.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(ry.n.W(set, 10));
        for (String str2 : set) {
            kotlin.jvm.internal.m.c(str2);
            arrayList.add(new XPCollectionItem(str2, asJsonObject.get(str2).getAsJsonObject().get("xp").getAsInt(), asJsonObject.get(str2).getAsJsonObject().get("bsxp").getAsInt()));
        }
        return new ApiResponse.Success(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object u(String str, String str2, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        s0 s0Var;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i11 = s0Var.f24511c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                s0Var.f24511c = i11 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, cVar);
            }
        } else {
            s0Var = new s0(this, cVar);
        }
        s0 s0Var2 = s0Var;
        Object objV = s0Var2.f24509a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = s0Var2.f24511c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("from", str2);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<SubscriptionResponse>>() { // from class: com.lingodeer.network.NetworkClient$purchaseMemberStatus$2
            };
            fz.c p0Var = new p0(this, jsonObject2, null, 3);
            s0Var2.f24511c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, p0Var, s0Var2);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return v0.a(apiResponse);
        }
        BillingStatus billingStatus = ApiResponseKt.toBillingStatus(((SubscriptionResponse) ((ApiResponse.Success) apiResponse).getData()).getM_membership());
        return billingStatus.getProductId().length() > 0 ? new ApiResponse.Success(billingStatus) : new ApiResponse.Error(BuildConfig.VERSION_NAME, 0, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(SecretKey secretKey, SecretKey secretKey2, TypeToken typeToken, BooleanResponse booleanResponse, fz.c cVar, vy.d dVar) {
        t0 t0Var;
        ApiResponse.Error error;
        Object obj;
        if (dVar instanceof t0) {
            t0Var = (t0) dVar;
            int i11 = t0Var.f24520t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t0Var.f24520t = i11 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, dVar);
            }
        } else {
            t0Var = new t0(this, dVar);
        }
        Object objInvoke = t0Var.f24518e;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = t0Var.f24520t;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objInvoke);
                t0Var.f24514a = secretKey;
                t0Var.f24515b = secretKey2;
                t0Var.f24516c = typeToken;
                t0Var.f24517d = booleanResponse;
                t0Var.f24520t = 1;
                objInvoke = cVar.invoke(t0Var);
                obj = booleanResponse;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = t0Var.f24517d;
                typeToken = t0Var.f24516c;
                secretKey2 = t0Var.f24515b;
                secretKey = t0Var.f24514a;
                com.bumptech.glide.e.F(objInvoke);
                obj = obj3;
            }
            o20.t0 t0Var2 = (o20.t0) objInvoke;
            Response response = t0Var2.f44598a;
            if (response.R) {
                String str = (String) t0Var2.f44599b;
                if (str != null) {
                    try {
                        a().getClass();
                        ServerJsonResponse serverJsonResponse = (ServerJsonResponse) new Gson().fromJson(hv.a.b(str, secretKey, secretKey2), typeToken.getType());
                        if (obj instanceof BooleanResponse) {
                            BooleanResponse booleanResponse2 = (BooleanResponse) obj;
                            if (serverJsonResponse.getStatus() != 0) {
                                z11 = false;
                            }
                            booleanResponse2.setSuccess(z11);
                            return new ApiResponse.Success(obj);
                        }
                        if (serverJsonResponse == null || serverJsonResponse.getStatus() != -1) {
                            return new ApiResponse.Success(serverJsonResponse.getResult());
                        }
                        String error2 = serverJsonResponse.getError();
                        String json = new Gson().toJson(serverJsonResponse.getResult());
                        kotlin.jvm.internal.m.e(json, "toJson(...)");
                        error = new ApiResponse.Error(error2, 0, json, 2, null);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        error = new ApiResponse.Error("JsonSyntaxException", 0, null, 6, null);
                    }
                } else {
                    error = new ApiResponse.Error("Empty response", 0, null, 6, null);
                }
            } else {
                String str2 = response.f45160c;
                kotlin.jvm.internal.m.e(str2, "message(...)");
                error = new ApiResponse.Error(str2, t0Var2.f44598a.f45161d, null, 4, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            String message = e10.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            error = new ApiResponse.Error(message, 0, null, 6, null);
        }
        return error;
    }

    public final Object w(String str, dr.n nVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(this, jsonObjectC, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<ProgressGetSRSRecordResponse>>() { // from class: com.lingodeer.network.NetworkClient$reviewSRSRecordGet$2
        }, null, new p0(this, (JsonObject) lVarY.f48495a, null, 4), nVar);
    }

    public final Object x(String str, String str2, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add("followings_remove", new Gson().toJsonTree(ns.o.K(str2)));
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(this, jsonObjectC, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<MeDataFriendsUpdateResponse>>() { // from class: com.lingodeer.network.NetworkClient$unFollowUser$2
        }, null, new p0(this, (JsonObject) lVarY.f48495a, null, 5), iVar);
    }

    public final Object y(String str, boolean z11, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.addProperty("review_data_transfered", Boolean.valueOf(z11));
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$updateReviewDataTransferTag$2
        }, null, new p0(this, (JsonObject) lVarY.f48495a, null, 6), iVar);
    }

    public final Object z(String str, List list, List list2, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObjectC = ep.a.c("uid", str);
        jsonObjectC.add("data_lan_list", new Gson().toJsonTree(list));
        jsonObjectC.add("data_type_list", new Gson().toJsonTree(list2));
        qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", b7.e0.i(this, jsonObjectC, this.f24526e));
        qy.l lVar = (qy.l) lVarY.f48496b;
        SecretKey secretKey = (SecretKey) lVar.f48495a;
        SecretKey secretKey2 = (SecretKey) lVar.f48496b;
        JsonObject jsonObject = (JsonObject) lVarY.f48495a;
        File file = new File(defpackage.e.m(((fr.o0) this.f24522a).v(), "user_items_review_data_reset_postContent.txt"));
        String string = jsonObject.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        cz.k.V(file, string);
        return v(secretKey, secretKey2, new TypeToken<ServerJsonResponse<ServerReviewDataResponse>>() { // from class: com.lingodeer.network.NetworkClient$userItemsReviewDataReset$2
        }, null, new p0(this, jsonObject, null, 15), iVar);
    }

    public final Object B(String str, String str2, String str3, String str4, String str5, boolean z11, int i11, xy.i iVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uid", str);
        jsonObject.addProperty("nickName", str2);
        jsonObject.addProperty("image", str3);
        jsonObject.addProperty("messagetoken", str4);
        jsonObject.addProperty(scqhIrGXy.JaVaeZhAcWIACZ, str5);
        jsonObject.addProperty("shareme", Boolean.valueOf(z11));
        jsonObject.addProperty("emojiStatus", new Integer(i11));
        jsonObject.add(this.f24526e, c());
        jsonObject.add(this.f24527f, b());
        qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", a());
        qy.l lVar = (qy.l) lVarY.f48496b;
        return v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<LeaderBoardResponse>>() { // from class: com.lingodeer.network.NetworkClient$userLeaderboardUpdatePrivates$2
        }, null, new p0(this, (JsonObject) lVarY.f48495a, null, 19), iVar);
    }

    public final JsonObject c() {
        JsonObject jsonObjectC = ep.a.c("client_from", "Android");
        jsonObjectC.addProperty("uversion", this.f24525d);
        Env env = ((fr.o0) this.f24522a).f27733a;
        String globalUID = env.globalUID;
        kotlin.jvm.internal.m.e(globalUID, "globalUID");
        jsonObjectC.addProperty("globe_uid", globalUID);
        String firebaseInstallId = env.firebaseInstallId;
        kotlin.jvm.internal.m.e(firebaseInstallId, "firebaseInstallId");
        jsonObjectC.addProperty("firebase_fid", firebaseInstallId);
        String str = scqhIrGXy.eIdmpaOdj;
        jsonObjectC.addProperty("adjust_adid", str);
        jsonObjectC.addProperty("idfa", str);
        jsonObjectC.addProperty("idfv", str);
        String gpsAdID = env.gpsAdID;
        kotlin.jvm.internal.m.e(gpsAdID, "gpsAdID");
        jsonObjectC.addProperty("gps_adid", gpsAdID);
        jsonObjectC.addProperty("adjust_attribution", str);
        return jsonObjectC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, String str3, String str4, String str5, String str6, String str7, xy.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i11 = h0Var.f24454c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                h0Var.f24454c = i11 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objV = h0Var.f24452a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = h0Var.f24454c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objV);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("uid", str);
            jsonObject.addProperty("package_Name", str2);
            jsonObject.addProperty("product_Id", str3);
            jsonObject.addProperty("purchase_Token", str4);
            jsonObject.addProperty("purchase_orderid", str5);
            jsonObject.addProperty("priceAmountMicros", str6);
            jsonObject.addProperty(MzwEyWCkjXL.ysLPeTcIt, str7);
            qy.l lVarY = nv.p.y(jsonObject, "toJson(...)", b7.e0.i(this, jsonObject, this.f24526e));
            qy.l lVar = (qy.l) lVarY.f48496b;
            SecretKey secretKey = (SecretKey) lVar.f48495a;
            SecretKey secretKey2 = (SecretKey) lVar.f48496b;
            JsonObject jsonObject2 = (JsonObject) lVarY.f48495a;
            TypeToken typeToken = new TypeToken<ServerJsonResponse<SubscriptionResponse>>() { // from class: com.lingodeer.network.NetworkClient$gpPurchaseOneTime$2
            };
            fz.c g0Var = new g0(this, jsonObject2, null, 3);
            h0Var.f24454c = 1;
            objV = v(secretKey, secretKey2, typeToken, null, g0Var, h0Var);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objV);
        }
        ApiResponse apiResponse = (ApiResponse) objV;
        if (!(apiResponse instanceof ApiResponse.Success)) {
            return v0.a(apiResponse);
        }
        BillingStatus billingStatus = ApiResponseKt.toBillingStatus(((SubscriptionResponse) ((ApiResponse.Success) apiResponse).getData()).getM_membership());
        return billingStatus.getProductId().length() > 0 ? new ApiResponse.Success(billingStatus) : new ApiResponse.Error(BuildConfig.VERSION_NAME, 0, null, 6, null);
    }
}
