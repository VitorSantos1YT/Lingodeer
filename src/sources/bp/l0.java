package bp;

import androidx.lifecycle.ViewModelKt;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiItemEntity f4676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ep.c f4677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f4678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4680f;

    public l0(boolean z11, MultiItemEntity multiItemEntity, ep.c cVar, fz.c cVar2, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4675a = z11;
        this.f4676b = multiItemEntity;
        this.f4677c = cVar;
        this.f4678d = cVar2;
        this.f4679e = b1Var;
        this.f4680f = b1Var2;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean z11 = this.f4675a;
        MultiItemEntity multiItemEntity = this.f4676b;
        if (z11) {
            this.f4679e.setValue((LanguageItem) multiItemEntity);
            this.f4680f.setValue(Boolean.TRUE);
        } else {
            LanguageItem languageItem = (LanguageItem) multiItemEntity;
            int keyLanguage = languageItem.getKeyLanguage();
            int locate = languageItem.getLocate();
            String name = languageItem.getName();
            kotlin.jvm.internal.m.e(name, nuRcCS.dqhBEG);
            String description = languageItem.getDescription();
            if (description == null) {
                description = BuildConfig.VERSION_NAME;
            }
            LanguageHistoryEntity languageHistoryEntity = new LanguageHistoryEntity(keyLanguage + "-" + locate, keyLanguage, locate, name, description, System.currentTimeMillis());
            ep.c cVar = this.f4677c;
            rz.e0.B(ViewModelKt.getViewModelScope(cVar), null, null, new e6.q0(1, cVar, languageHistoryEntity, (vy.d) null), 3);
            this.f4678d.invoke(multiItemEntity);
        }
        return qy.b0.f48488a;
    }
}
