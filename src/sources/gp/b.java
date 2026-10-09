package gp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f29339a = {"#F38D0C", "#456EE1", "#9141C5", "#DD4A4A", "#F67814", "#1AAE68", "#D13572"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[][] f29340b = {new String[]{"#FFC900", "#FFC900", "#FDC200", "#FBBB00", "#FAB400", "#F8AD00", "#F6A600", "#F49F00", "#F29800", "#EF9100", "#ED8A00", "#EB8300"}, new String[]{"#32CBEF", "#38C0EF", "#3DB5EF", "#3FAAEF", "#409FEF", "#4094EE", "#3F89EE", "#3C7EEE", "#3873ED", "#3368ED", "#2B5DEC"}, new String[]{"#EC6EF5", "#E468F2", "#DB62EF", "#D35CEC", "#CA56E9", "#C251E6", "#B94BE2", "#B045DF", "#A83FDC", "#9F39D9", "#9633D6"}, new String[]{"#FF6A92", "#FD6689", "#FA6181", "#F75D78", "#F45970", "#F25467", "#EF505F", "#EC4C57", "#E8474F", "#E54346", "#E23E3E"}, new String[]{"#FFAB51", "#FFAB51", "#FFA64B", "#FFA044", "#FF9A3E", "#FF9537", "#FF8F31", "#FF892A", "#FF8322", "#FF7D19", "#FF770E", "#FF7100"}, new String[]{"#56DF9E", "#56DF9E", "#50D997", "#4AD391", "#44CD8A", "#3EC783", "#38C27D", "#31BC76", "#2AB670", "#22B06A", "#19AB63", "#0CA55D"}, new String[]{"#FE76AC", "#FE76AC", "#FC6FA6", "#F9689F", "#F76299", "#F45A93", "#F1538D", "#EF4B87", "#EC4381", "#E93A7B", "#E63075", "#E3246F"}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer[] f29341c = {Integer.valueOf(R.drawable.new_learn_banner_bg_1), Integer.valueOf(R.drawable.new_learn_banner_bg_2), Integer.valueOf(R.drawable.new_learn_banner_bg_3), Integer.valueOf(R.drawable.new_learn_banner_bg_4), Integer.valueOf(R.drawable.new_learn_banner_bg_5), Integer.valueOf(R.drawable.new_learn_banner_bg_6), Integer.valueOf(R.drawable.new_learn_banner_bg_7)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[][] f29342d = {new String[]{"#FFD20B", "#FFEA54"}, new String[]{"#1AB8FF", "#32CBEF"}, new String[]{"#BA50FF", "#CD81FF"}, new String[]{"#FF5050", "#FF7D7D"}, new String[]{"#FF8B2B", "#FFA65D"}, new String[]{"#26C67A", "#61E5A6"}, new String[]{"#EA4988", "#FF78AD"}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n9.q f29343e = new n9.q(29, false);

    public b() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.TRUE);
        Transformations.switchMap(mutableLiveData, new com.google.firebase.datastorage.a(this, 28));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f29343e.f();
    }
}
