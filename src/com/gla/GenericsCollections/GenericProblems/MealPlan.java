interface MealPlan {}

class VegMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T p) { plan = p; }
}