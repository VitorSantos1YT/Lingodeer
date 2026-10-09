package r;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.lingo.lingoskill.widget.TopViewArrowLine;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f48717b;

    public /* synthetic */ y1(View view, int i11) {
        this.f48716a = i11;
        this.f48717b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = this.f48716a;
        View view2 = this.f48717b;
        switch (i19) {
            case 0:
                SearchView searchView = (SearchView) view2;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.R;
                View view3 = searchView.f970c0;
                if (view3.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.T.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z11 = b3.f48531a;
                    boolean z12 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.f985r0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(z12 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view3.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                }
                break;
            default:
                TopViewArrowLine topViewArrowLine = (TopViewArrowLine) view2;
                view.removeOnLayoutChangeListener(this);
                try {
                    int i21 = TopViewArrowLine.f22169t;
                    topViewArrowLine.a();
                    topViewArrowLine.invalidate();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                break;
        }
    }
}
