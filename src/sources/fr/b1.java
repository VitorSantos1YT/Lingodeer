package fr;

import com.lingodeer.data.model.UserInfo;
import com.lingodeer.network.model.AnimatedEmojiRedeemResponse;
import com.lingodeer.network.model.ApiResponse;
import com.lingodeer.network.model.GemPurchaseResponse;
import com.lingodeer.network.model.MeDataFriendsUpdateResponse;
import com.lingodeer.network.model.StreakFreezeApplyResponse;
import com.lingodeer.network.model.StreakFreezeRedeemResponse;
import com.lingodeer.network.model.UserPassChallengeByGemsResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApiResponse.Success f27408b;

    public /* synthetic */ b1(ApiResponse.Success success, int i11) {
        this.f27407a = i11;
        this.f27408b = success;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        switch (this.f27407a) {
            case 0:
                return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, ((MeDataFriendsUpdateResponse) this.f27408b.getData()).getAll_followings(), 0, 0, 0, 0, 0, 0, null, null, 33488895, null);
            case 1:
                return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, ((MeDataFriendsUpdateResponse) this.f27408b.getData()).getAll_followings(), 0, 0, 0, 0, 0, 0, null, null, 33488895, null);
            case 2:
                return UserInfo.copy$default(userInfo, null, 0, ((GemPurchaseResponse) this.f27408b.getData()).getTotal_gems(), 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33554427, null);
            case 3:
                ApiResponse.Success success = this.f27408b;
                return UserInfo.copy$default(userInfo, null, 0, ((StreakFreezeRedeemResponse) success.getData()).getTotal_gems(), ((StreakFreezeRedeemResponse) success.getData()).getTotal_streakfreezer(), 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33554419, null);
            case 4:
                return UserInfo.copy$default(userInfo, null, 0, 0, ((StreakFreezeApplyResponse) this.f27408b.getData()).getTotal_streakfreezer(), 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33554423, null);
            case 5:
                ApiResponse.Success success2 = this.f27408b;
                return UserInfo.copy$default(userInfo, null, 0, ((AnimatedEmojiRedeemResponse) success2.getData()).getTotal_gems(), 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, ((AnimatedEmojiRedeemResponse) success2.getData()).getEmoji_id_list(), 16777211, null);
            default:
                return UserInfo.copy$default(userInfo, null, 0, ((UserPassChallengeByGemsResponse) this.f27408b.getData()).getTotalGems(), 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, 33554427, null);
        }
    }
}
