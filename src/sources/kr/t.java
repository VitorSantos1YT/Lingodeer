package kr;

import com.lingo.lingoskill.speak.object.PodUser;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.MeUserDataResponse;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f38579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PodUser f38580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0 b0Var, PodUser podUser, vy.d dVar) {
        super(2, dVar);
        this.f38579b = b0Var;
        this.f38580c = podUser;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new t(this.f38579b, this.f38580c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Object objI;
        String user_nickname;
        String str;
        String user_image;
        String str2;
        String videourl;
        String str3;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38578a;
        b0 b0Var = this.f38579b;
        PodUser podUser = this.f38580c;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            dv.u0 u0Var = b0Var.f38427d;
            String uid = podUser.getUid();
            kotlin.jvm.internal.m.e(uid, "getUid(...)");
            this.f38578a = 1;
            objI = u0Var.i(uid, this);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            objI = obj;
        }
        ApiResponse apiResponse = (ApiResponse) objI;
        String uid2 = podUser.getUid();
        kotlin.jvm.internal.m.e(uid2, "getUid(...)");
        boolean z11 = apiResponse instanceof ApiResponse.Error;
        if (z11) {
            user_nickname = podUser.getNickname();
            if (user_nickname == null) {
                str = BuildConfig.VERSION_NAME;
            }
            if (z11) {
                user_image = podUser.getPicurl();
                if (user_image == null) {
                    str2 = BuildConfig.VERSION_NAME;
                }
                videourl = podUser.getVideourl();
                if (videourl == null) {
                    str3 = BuildConfig.VERSION_NAME;
                } else {
                    str3 = videourl;
                }
                return new n(uid2, str, str2, str3, podUser.getTimestamp(), b0Var.f38428e, podUser.getLike_num(), podUser.like_list.containsKey(((fr.o0) b0Var.f38424a).w()), false, false, CropImageView.DEFAULT_ASPECT_RATIO);
            }
            if (apiResponse instanceof ApiResponse.Success) {
                throw new NoWhenBranchMatchedException();
            }
            user_image = ((MeUserDataResponse) ((ApiResponse.Success) apiResponse).getData()).getUser_image();
            str2 = user_image;
            videourl = podUser.getVideourl();
            if (videourl == null) {
                str3 = BuildConfig.VERSION_NAME;
            } else {
                str3 = videourl;
            }
            return new n(uid2, str, str2, str3, podUser.getTimestamp(), b0Var.f38428e, podUser.getLike_num(), podUser.like_list.containsKey(((fr.o0) b0Var.f38424a).w()), false, false, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if (!(apiResponse instanceof ApiResponse.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        user_nickname = ((MeUserDataResponse) ((ApiResponse.Success) apiResponse).getData()).getUser_nickname();
        str = user_nickname;
        if (z11) {
            user_image = podUser.getPicurl();
            if (user_image == null) {
                str2 = BuildConfig.VERSION_NAME;
            }
            videourl = podUser.getVideourl();
            if (videourl == null) {
                str3 = BuildConfig.VERSION_NAME;
            } else {
                str3 = videourl;
            }
            return new n(uid2, str, str2, str3, podUser.getTimestamp(), b0Var.f38428e, podUser.getLike_num(), podUser.like_list.containsKey(((fr.o0) b0Var.f38424a).w()), false, false, CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if (apiResponse instanceof ApiResponse.Success) {
            throw new NoWhenBranchMatchedException();
        }
        user_image = ((MeUserDataResponse) ((ApiResponse.Success) apiResponse).getData()).getUser_image();
        str2 = user_image;
        videourl = podUser.getVideourl();
        if (videourl == null) {
            str3 = BuildConfig.VERSION_NAME;
        } else {
            str3 = videourl;
        }
        return new n(uid2, str, str2, str3, podUser.getTimestamp(), b0Var.f38428e, podUser.getLike_num(), podUser.like_list.containsKey(((fr.o0) b0Var.f38424a).w()), false, false, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
