public class BonusMilesService {
    public int calculate(int cost) {
        // исходные данные
        int bonusScale = 20;
        //логика
        int bonusMile = cost / bonusScale;
        // возврат миль
        return bonusMile;
    }
}
