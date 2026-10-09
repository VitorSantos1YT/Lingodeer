package com.google.android.material.datepicker;

import a5.g;
import android.R;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.r1;
import androidx.recyclerview.widget.w0;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Calendar;
import l0.Eeqr.HOBXIlHxIkMBEA;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public CalendarStyle H;
    public RecyclerView K;
    public RecyclerView L;
    public View M;
    public View N;
    public View O;
    public View P;
    public MaterialButton Q;
    public AccessibilityManager R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateSelector f14342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarConstraints f14343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DayViewDecorator f14344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Month f14345f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CalendarSelector f14346t;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends z4.b {
        @Override // z4.b
        public final void d(View view, g gVar) {
            this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
            gVar.n(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements OnDayClickListener {
        public AnonymousClass3() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 extends z4.b {
        @Override // z4.b
        public final void d(View view, g gVar) {
            this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
            gVar.u(false);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CalendarSelector {
        private static final /* synthetic */ CalendarSelector[] $VALUES;
        public static final CalendarSelector DAY;
        public static final CalendarSelector YEAR;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            DAY = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            YEAR = calendarSelector2;
            $VALUES = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface OnDayClickListener {
    }

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14341b = bundle.getInt("THEME_RES_ID_KEY");
        this.f14342c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f14343d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f14344e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f14345f = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14341b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f14342c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14343d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f14344e);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f14345f);
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void q(OnSelectionChangedListener onSelectionChangedListener) {
        this.f14420a.add(onSelectionChangedListener);
    }

    public final void r(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.L.getAdapter();
        final int iE = monthsPagerAdapter.f14411a.f14300a.e(month);
        AccessibilityManager accessibilityManager = this.R;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iE2 = iE - monthsPagerAdapter.f14411a.f14300a.e(this.f14345f);
            boolean z11 = Math.abs(iE2) > 3;
            boolean z12 = iE2 > 0;
            this.f14345f = month;
            if (z11 && z12) {
                this.L.scrollToPosition(iE - 3);
                this.L.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialCalendar.this.L.smoothScrollToPosition(iE);
                    }
                });
            } else if (z11) {
                this.L.scrollToPosition(iE + 3);
                this.L.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialCalendar.this.L.smoothScrollToPosition(iE);
                    }
                });
            } else {
                this.L.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialCalendar.this.L.smoothScrollToPosition(iE);
                    }
                });
            }
        } else {
            this.f14345f = month;
            this.L.scrollToPosition(iE);
        }
        t(iE);
    }

    public final void s(CalendarSelector calendarSelector) {
        this.f14346t = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.K.getLayoutManager().scrollToPosition(this.f14345f.f14399c - ((YearGridAdapter) this.K.getAdapter()).f14428a.f14343d.f14300a.f14399c);
            this.O.setVisibility(0);
            this.P.setVisibility(8);
            this.M.setVisibility(8);
            this.N.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.O.setVisibility(8);
            this.P.setVisibility(0);
            this.M.setVisibility(0);
            this.N.setVisibility(0);
            r(this.f14345f);
        }
    }

    public final void t(int i11) {
        this.N.setEnabled(i11 + 1 < this.L.getAdapter().getItemCount());
        this.M.setEnabled(i11 - 1 >= 0);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        final int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f14341b);
        this.H = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.R = (AccessibilityManager) requireContext().getSystemService(HOBXIlHxIkMBEA.ddopkjo);
        Month month = this.f14343d.f14300a;
        if (MaterialDatePicker.x(contextThemeWrapper, R.attr.windowFullscreen)) {
            i11 = com.lingodeer.R.layout.mtrl_calendar_vertical;
            i12 = 1;
        } else {
            i11 = com.lingodeer.R.layout.mtrl_calendar_horizontal;
            i12 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i11, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_calendar_days_of_week_height);
        int i13 = MonthAdapter.f14404t;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_calendar_month_vertical_padding) * (i13 - 1)) + (resources.getDimensionPixelSize(com.lingodeer.R.dimen.mtrl_calendar_day_height) * i13) + resources.getDimensionPixelOffset(com.lingodeer.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.lingodeer.R.id.mtrl_calendar_days_of_week);
        s0.q(gridView, new AnonymousClass1());
        int i14 = this.f14343d.f14304e;
        gridView.setAdapter((ListAdapter) (i14 > 0 ? new DaysOfWeekAdapter(i14) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(month.f14400d);
        gridView.setEnabled(false);
        this.L = (RecyclerView) viewInflate.findViewById(com.lingodeer.R.id.mtrl_calendar_months);
        getContext();
        this.L.setLayoutManager(new SmoothCalendarLayoutManager(i12) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(c2 c2Var, int[] iArr) {
                int i15 = i12;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (i15 == 0) {
                    iArr[0] = materialCalendar.L.getWidth();
                    iArr[1] = materialCalendar.L.getWidth();
                } else {
                    iArr[0] = materialCalendar.L.getHeight();
                    iArr[1] = materialCalendar.L.getHeight();
                }
            }
        });
        this.L.setTag("MONTHS_VIEW_GROUP_TAG");
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f14342c, this.f14343d, this.f14344e, new AnonymousClass3());
        this.L.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.lingodeer.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.lingodeer.R.id.mtrl_calendar_year_selector_frame);
        this.K = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.K.setLayoutManager(new GridLayoutManager(integer, 0));
            this.K.setAdapter(new YearGridAdapter(this));
            this.K.addItemDecoration(new j1() { // from class: com.google.android.material.datepicker.MaterialCalendar.5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Calendar f14354a = UtcDates.g(null);

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Calendar f14355b = UtcDates.g(null);

                @Override // androidx.recyclerview.widget.j1
                public final void onDraw(Canvas canvas, RecyclerView recyclerView2, c2 c2Var) {
                    AnonymousClass5 anonymousClass5 = this;
                    if ((recyclerView2.getAdapter() instanceof YearGridAdapter) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        ArrayList arrayListA = materialCalendar.f14342c.A();
                        int size = arrayListA.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = arrayListA.get(i15);
                            i15++;
                            y4.b bVar = (y4.b) obj;
                            Object obj2 = bVar.f57088a;
                            Object obj3 = bVar.f57089b;
                            if (obj2 != null) {
                                if (obj3 != null) {
                                    long jLongValue = ((Long) obj2).longValue();
                                    Calendar calendar = anonymousClass5.f14354a;
                                    calendar.setTimeInMillis(jLongValue);
                                    long jLongValue2 = ((Long) obj3).longValue();
                                    Calendar calendar2 = anonymousClass5.f14355b;
                                    calendar2.setTimeInMillis(jLongValue2);
                                    int i16 = calendar.get(1) - yearGridAdapter.f14428a.f14343d.f14300a.f14399c;
                                    int i17 = calendar2.get(1) - yearGridAdapter.f14428a.f14343d.f14300a.f14399c;
                                    View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i16);
                                    View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i17);
                                    int i18 = gridLayoutManager.f2385b;
                                    int i19 = i16 / i18;
                                    int i21 = i17 / i18;
                                    int i22 = i19;
                                    while (i22 <= i21) {
                                        View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.f2385b * i22);
                                        if (viewFindViewByPosition3 != null) {
                                            canvas.drawRect((i22 != i19 || viewFindViewByPosition == null) ? 0 : d.c(viewFindViewByPosition, 2, viewFindViewByPosition.getLeft()), viewFindViewByPosition3.getTop() + materialCalendar.H.f14319d.f14310a.top, (i22 != i21 || viewFindViewByPosition2 == null) ? recyclerView2.getWidth() : d.c(viewFindViewByPosition2, 2, viewFindViewByPosition2.getLeft()), viewFindViewByPosition3.getBottom() - materialCalendar.H.f14319d.f14310a.bottom, materialCalendar.H.f14323h);
                                        }
                                        i22++;
                                    }
                                }
                            }
                            anonymousClass5 = this;
                        }
                    }
                }
            });
        }
        View viewFindViewById = viewInflate.findViewById(com.lingodeer.R.id.month_navigation_fragment_toggle);
        CalendarConstraints calendarConstraints = monthsPagerAdapter.f14411a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.lingodeer.R.id.month_navigation_fragment_toggle);
            this.Q = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            s0.q(this.Q, new z4.b() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
                @Override // z4.b
                public final void d(View view, g gVar) {
                    this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    gVar.b(new a5.c(16, materialCalendar.P.getVisibility() == 0 ? materialCalendar.getString(com.lingodeer.R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(com.lingodeer.R.string.mtrl_picker_toggle_to_day_selection)));
                }
            });
            View viewFindViewById2 = viewInflate.findViewById(com.lingodeer.R.id.month_navigation_previous);
            this.M = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.lingodeer.R.id.month_navigation_next);
            this.N = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.O = viewInflate.findViewById(com.lingodeer.R.id.mtrl_calendar_year_selector_frame);
            this.P = viewInflate.findViewById(com.lingodeer.R.id.mtrl_calendar_day_selector_frame);
            s(CalendarSelector.DAY);
            this.Q.setText(this.f14345f.c());
            this.L.addOnScrollListener(new r1() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
                @Override // androidx.recyclerview.widget.r1
                public final void onScrolled(RecyclerView recyclerView2, int i15, int i16) {
                    CalendarConstraints calendarConstraints2 = monthsPagerAdapter.f14411a;
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindFirstVisibleItemPosition = i15 < 0 ? ((LinearLayoutManager) materialCalendar.L.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) materialCalendar.L.getLayoutManager()).findLastVisibleItemPosition();
                    Calendar calendarC = UtcDates.c(calendarConstraints2.f14300a.f14397a);
                    calendarC.add(2, iFindFirstVisibleItemPosition);
                    Month month2 = new Month(calendarC);
                    materialCalendar.f14345f = month2;
                    MaterialButton materialButton2 = materialCalendar.Q;
                    Calendar calendarC2 = UtcDates.c(calendarConstraints2.f14300a.f14397a);
                    calendarC2.add(2, iFindFirstVisibleItemPosition);
                    materialButton2.setText(new Month(calendarC2).c());
                    materialCalendar.t(calendarConstraints2.f14300a.e(month2));
                }
            });
            this.Q.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    CalendarSelector calendarSelector = materialCalendar.f14346t;
                    CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
                    if (calendarSelector == calendarSelector2) {
                        materialCalendar.s(CalendarSelector.DAY);
                        materialCalendar.L.announceForAccessibility(materialCalendar.getString(com.lingodeer.R.string.mtrl_picker_toggled_to_day_selection));
                    } else if (calendarSelector == CalendarSelector.DAY) {
                        materialCalendar.s(calendarSelector2);
                        materialCalendar.K.announceForAccessibility(materialCalendar.getString(com.lingodeer.R.string.mtrl_picker_toggled_to_year_selection));
                    }
                }
            });
            this.N.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.L.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                    Calendar calendarC = UtcDates.c(monthsPagerAdapter.f14411a.f14300a.f14397a);
                    calendarC.add(2, iFindFirstVisibleItemPosition);
                    materialCalendar.r(new Month(calendarC));
                }
            });
            this.M.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iFindLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.L.getLayoutManager()).findLastVisibleItemPosition() - 1;
                    Calendar calendarC = UtcDates.c(monthsPagerAdapter.f14411a.f14300a.f14397a);
                    calendarC.add(2, iFindLastVisibleItemPosition);
                    materialCalendar.r(new Month(calendarC));
                }
            });
            t(calendarConstraints.f14300a.e(this.f14345f));
        }
        if (!MaterialDatePicker.x(contextThemeWrapper, R.attr.windowFullscreen)) {
            new w0().attachToRecyclerView(this.L);
        }
        this.L.scrollToPosition(calendarConstraints.f14300a.e(this.f14345f));
        s0.q(this.L, new AnonymousClass4());
        return viewInflate;
    }
}
