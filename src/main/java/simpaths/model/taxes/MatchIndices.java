package simpaths.model.taxes;


/**
 *
 * CLASS TO STORE MATCHING INDICES TO ASSIST EXPANSION OF TAX DATABASE INPUT DATA
 *
 */
public class MatchIndices {

    /**
     * ATTRIBUTES
     */
    private long candidateID;
    double targetNormalisedOriginalIncome;  // normalised income is per month in BASE_PRICE_YEAR year prices
    private int childcare;
    private int dualIncome;
    private int income;
    private int careProvision;
    private int disability;
    private int employment;
    private int children;
    private int adults;
    private int age;


    /**
     * CONSTRUCTOR
     */
    public MatchIndices() {}

    public MatchIndices(long candidateID, double targetOriginalIncomePerMonth) {
        this.candidateID = candidateID;
        this.targetNormalisedOriginalIncome = targetOriginalIncomePerMonth;
    }


    /**
     * GETTERS AND SETTERS
     */
    public int getChildcare() {
        return childcare;
    }

    public void setChildcare(int childcare) {
        this.childcare = childcare;
    }

    public int getDualIncome() {
        return dualIncome;
    }

    public void setDualIncome(int dualIncome) {
        this.dualIncome = dualIncome;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCareProvision() {
        return careProvision;
    }

    public void setCareProvision(int careProvision) {
        this.careProvision = careProvision;
    }

    public int getDisability() {
        return disability;
    }

    public void setDisability(int disability) {
        this.disability = disability;
    }

    public int getEmployment() {
        return employment;
    }

    public void setEmployment(int employment) {
        this.employment = employment;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void set(MatchFeature feature, int val) {
        switch(feature) {
            case Age:
                setAge(val);
                break;
            case Adults:
                setAdults(val);
                break;
            case Children:
                setChildren(val);
                break;
            case Employment:
                setEmployment(val);
                break;
            case Disability:
                setDisability(val);
                break;
            case CareProvision:
                setCareProvision(val);
                break;
            case Income:
                setIncome(val);
                break;
            case DualIncome:
                setDualIncome(val);
                break;
            case Childcare:
                setChildcare(val);
                break;
            default:
                break;
        }
    }

    public String getString(MatchFeature feature) {
        switch(feature) {
            case Age:
                return String.valueOf(getAge());
            case Adults:
                return String.valueOf(getAdults());
            case Children:
                return String.valueOf(getChildren());
            case Employment:
                return String.valueOf(getEmployment());
            case Disability:
                return String.valueOf(getDisability());
            case CareProvision:
                return String.valueOf(getCareProvision());
            case Income:
                return String.valueOf(getIncome());
            case DualIncome:
                return String.valueOf(getDualIncome());
            case Childcare:
                return String.valueOf(getChildcare());
        }
        throw new RuntimeException("failed to identify feature for write");
    }
    public String getCandidateIDString() {
        return Long.toString(candidateID);
    }
    public String getTargetOriginalIncomeString() {
        return Double.toString(targetNormalisedOriginalIncome);
    }
}
